package com.sb.main.service;


import com.sb.main.dto.ResponseBodyDTO;
import com.sb.main.dto.UserDetailDTO;
import com.sb.main.dto.UserLoginDTO;
import com.sb.main.entity.UserLoginDetails;

public interface IUserMgmtService {
	
	public boolean createUser(UserDetailDTO userDetailDto);
	public UserLoginDetails loginUser(UserLoginDTO userLoginDto);
	
		
	}


