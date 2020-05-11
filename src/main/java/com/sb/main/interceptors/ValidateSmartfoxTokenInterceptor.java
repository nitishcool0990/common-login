package com.sb.main.interceptors;
	
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.sb.main.util.UserTokenDAO;

public class ValidateSmartfoxTokenInterceptor extends HandlerInterceptorAdapter {
	
	private static final Logger logger = LogManager.getLogger(ValidateSmartfoxTokenInterceptor.class);
	
	private static final String ACCESS_TOKEN_KEY = "st_";	
	private static final String INVALID_TOKEN = "Invalid Token";
	public static final String USERID = "userId";
	public static final String START_TIME = "startTime";
	public static final String STOKEN = "accessToken";

	
	@Autowired
	private UserTokenDAO repository;
	
	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
		long startTime = System.currentTimeMillis();
		logger.info("ValidateSmartfoxTokenInterceptor Request URL::"
				+ request.getRequestURL().toString() + ":: Start Time="
				+ System.currentTimeMillis());
		request.setAttribute(this.START_TIME, startTime);
		// if returned false, we need to make sure 'response' is sent
		String sfsToken = request.getParameter(this.STOKEN);
		String userId = request.getParameter(this.USERID);
		boolean isvalidToken = false;
		try {
			if(userId == null || sfsToken == null) {
				response.getWriter().write(INVALID_TOKEN);
				return false;
			}
			String token = repository.getRedisTemplate().opsForValue().get(ACCESS_TOKEN_KEY+userId);
			if (token!=null && token.equalsIgnoreCase(sfsToken)) {
				isvalidToken = true;
			} else {	

				response.getWriter().write(INVALID_TOKEN);
				isvalidToken = false;
			}
		} catch (Exception ex) {
			logger.error(
					"ValidateSmartfoxTokenInterceptor preHandle : "
							+ ex.getMessage(), ex);

			response.getWriter().write("Exception !	");
			isvalidToken = false;
		}

		return isvalidToken;
	}

}
