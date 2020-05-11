package com.sb.main.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.sb.main.entity.UserLoginDetails;
import com.sb.main.entity.SbUserProfile;
import com.sb.main.repository.SBUserProfileRepo;
import com.sb.main.repository.UserRepository;

public class SBUserDetailDaoImpl implements SbUserDetailDao{

	@Autowired
	private UserRepository sbUserRepo ;
	
	@Autowired
	private SBUserProfileRepo sbUserProfileRepo ;

	@Override
	public UserLoginDetails getUserByID(int id) {
		sbUserRepo.findById(id);
		return null;
	}

	@Override
	public SbUserProfile getUserProfileByUserId(int id) {
		sbUserProfileRepo.findById(id);
		return null;
	}

	@Override
	public List<UserLoginDetails> getUserByWhatsappNumber(String whatsappNumber) {
		// TODO Auto-generated method stub
		
		return sbUserRepo.findByWatsappNum(whatsappNumber);
	}
	
	
}
