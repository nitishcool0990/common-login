package com.sb.main.dao;

import org.springframework.beans.factory.annotation.Autowired;

import com.sb.main.entity.SbUser;
import com.sb.main.entity.SbUserProfile;
import com.sb.main.repository.SBUserProfileRepo;
import com.sb.main.repository.SBUserRepository;

public class SBUserDetailDaoImpl implements SbUserDetailDao{

	@Autowired
	private SBUserRepository sbUserRepo ;
	
	@Autowired
	private SBUserProfileRepo sbUserProfileRepo ;

	@Override
	public SbUser getUserByID(int id) {
		sbUserRepo.findById(id);
		return null;
	}

	@Override
	public SbUserProfile getUserProfileByUserId(int id) {
		sbUserProfileRepo.findById(id);
		return null;
	}
	
	
}
