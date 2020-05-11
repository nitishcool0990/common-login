package com.sb.main.controller;

import java.lang.reflect.InvocationTargetException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.pojo.LoginResponse;
import com.pojo.Response;
import com.sb.main.dto.ResponseBodyDTO;
import com.sb.main.dto.UserDetailDTO;
import com.sb.main.dto.UserLoginDTO;
import com.sb.main.entity.UserLoginDetails;
import com.sb.main.service.IUserMgmtService;
import com.sb.main.util.UserTokenDAO;
import com.sb.main.util.UuidGenerator;

@RestController
@RequestMapping(value = "/commonService")
public class UserController extends BaseController{
	
	private static final Logger log = LogManager.getLogger(UserController.class);

	@Autowired
	private IUserMgmtService iUserMgmtService ;
	@Autowired
	private UserTokenDAO sfsToken;


	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ResponseEntity<ResponseBodyDTO>  userLoginHandler(@RequestBody UserLoginDTO userLoginDto) throws Exception {
		HttpStatus status = HttpStatus.OK;
		UserLoginDetails sbUser =  null;
		try {
			sbUser = iUserMgmtService.loginUser(userLoginDto);
			if(sbUser!=null) {
				String token = UuidGenerator.getUUIDCode();
				if(token!=null) {
				boolean tokenCreated=	sfsToken.setTokenInRedis(token, "st_"+sbUser.getUserId(), sbUser.getUserId()+"");
				if(tokenCreated) {
					LoginResponse response = new LoginResponse(sbUser.getClientName(), token, sbUser.getUserId());
					return  prepareResponse(response, status, true, Response.SUCCESS.getCode(), Response.SUCCESS.getMessage());
				}else{
					return  prepareResponse(token, status, true, Response.SERVER_INTERNAL_ERROR.getCode(), Response.SERVER_INTERNAL_ERROR.getMessage());
				}
				}else {
					return  prepareResponse(token, status, true, Response.SERVER_INTERNAL_ERROR.getCode(), Response.SERVER_INTERNAL_ERROR.getMessage());
				}
			}else {
				return  prepareResponse("Error", status, true, Response.UNAUTHORIZED_ACCESS.getCode(), Response.UNAUTHORIZED_ACCESS.getMessage());
			}
		}catch (Exception ex) {
			log.error(ex.getMessage());
			return  prepareResponse("Error", status, true, Response.SERVER_INTERNAL_ERROR.getCode(), Response.SERVER_INTERNAL_ERROR.getMessage());
		}

	}
	
	
	
	@RequestMapping(value = "/SBService/createUserProfile", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<ResponseBodyDTO> createUserProfile(@RequestBody  UserDetailDTO userDeatilDto)
			throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		HttpStatus status = HttpStatus.OK;
		boolean createStatus = false;
		try {
			createStatus = iUserMgmtService.createUser(userDeatilDto);
		} catch (Exception ex) {
			log.error(ex.getMessage());
			return prepareResponse(ex, status);
		}
		return prepareResponse(createStatus ,  status);
	}

	
	
	/*
	 * @CrossOrigin
	 * 
	 * @RequestMapping(value = "/SBService/userSelectedItems", method =
	 * RequestMethod.POST, headers = "Accept=application/json") public
	 * ResponseEntity<Object> setUserSelecetedItems(@RequestBody UserItemDetails
	 * userItemDetails) throws Exception {
	 * //System.out.println(userItemDetails.toString());
	 * sbService.createInvoice(userItemDetails); return new
	 * ResponseEntity<>("Welcome page!!!!!", HttpStatus.OK); }
	 */
}
 