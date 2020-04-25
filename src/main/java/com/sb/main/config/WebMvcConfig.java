package com.sb.main.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.sb.main.interceptors.ValidateSmartfoxTokenInterceptor;

@Configuration
public class WebMvcConfig  extends WebMvcConfigurerAdapter	 {

	@Bean
	public ValidateSmartfoxTokenInterceptor validateSmartfoxTokenInterceptor() {
		return new ValidateSmartfoxTokenInterceptor();
	}
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		
	//	registry.addInterceptor(validateSmartfoxTokenInterceptor()).excludePathPatterns(new String[] { "/commonService/login"});
		
		
	}
	

}
