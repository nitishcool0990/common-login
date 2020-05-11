package com.sb.main.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import com.sb.main.dao.UserMgmtDao;
import com.sb.main.dto.UserDetailDTO;
import com.sb.main.dto.UserLoginDTO;
import com.sb.main.entity.UserLoginDetails;
import com.sb.main.entity.SbUserProfile;
import com.sb.main.mapper.UserMgmtMapper;

@Service
//@Transactional(readOnly = false, propagation = Propagation.SUPPORTS)
public class UserMgmtServiceImpl implements IUserMgmtService{

	@Autowired
	private UserMgmtDao sbUserMgmtDao;
	@Autowired
	private UserMgmtMapper userMgmtMapper;
	
	@Override
	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public boolean createUser(UserDetailDTO userDetailDto) {
		
		SbUserProfile sbUserProfileEntity = userMgmtMapper.MapUserDetailsDtoTOEntity(userDetailDto);
	     sbUserMgmtDao.createUserProfile(sbUserProfileEntity);
		return true;
		
		
	}

	@Override
	@Transactional(readOnly = false, propagation = Propagation.REQUIRED)
	public UserLoginDetails loginUser(UserLoginDTO userLoginDto) {
		UserLoginDetails sbUser = null;
		try {
			sbUser = sbUserMgmtDao.getUserByUserNameAndPassword(userLoginDto.getUsername(), userLoginDto.getPassword());
		}catch(Exception e) {
			e.printStackTrace();
		}
		return sbUser;
		// TODO Auto-generated method stub
		
		
		
	}
	
	

	
}
