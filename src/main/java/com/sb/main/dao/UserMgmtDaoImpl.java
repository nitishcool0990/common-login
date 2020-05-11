package com.sb.main.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.sb.main.entity.UserLoginDetails;
import com.sb.main.entity.SbUserProfile;
import com.sb.main.repository.SBUserProfileRepo;
import com.sb.main.repository.UserRepository;


@Repository
//@Transactional(readOnly = true, propagation = Propagation.SUPPORTS)
public class UserMgmtDaoImpl implements UserMgmtDao{

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
	public UserLoginDetails createUser(UserLoginDetails sbUserEntity) {
		UserLoginDetails SbUserReturn = sbUserRepo.saveAndFlush(sbUserEntity);
		return SbUserReturn;
	}

	@Override
	public SbUserProfile createUserProfile(SbUserProfile sbUserProfileEntity) {
		SbUserProfile sbUserProfileReturn =  sbUserProfileRepo.saveAndFlush(sbUserProfileEntity);
		return sbUserProfileReturn;
	}

	@Override
	public UserLoginDetails getUserByUserNameAndPassword(String userName,String password) {
		return sbUserRepo.findByUserNameAndPassword(userName,password);
	}
	
	
	
	
	
}
