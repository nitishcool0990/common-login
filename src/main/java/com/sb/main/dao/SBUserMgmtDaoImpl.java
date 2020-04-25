package com.sb.main.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import com.sb.main.entity.SbUser;
import com.sb.main.entity.SbUserProfile;
import com.sb.main.repository.SBUserProfileRepo;
import com.sb.main.repository.SBUserRepository;


@Repository
//@Transactional(readOnly = true, propagation = Propagation.SUPPORTS)
public class SBUserMgmtDaoImpl implements SbUserMgmtDao{

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

	@Override
	public SbUser createUser(SbUser sbUserEntity) {
		SbUser SbUserReturn = sbUserRepo.saveAndFlush(sbUserEntity);
		return SbUserReturn;
	}

	@Override
	public SbUserProfile createUserProfile(SbUserProfile sbUserProfileEntity) {
		SbUserProfile sbUserProfileReturn =  sbUserProfileRepo.saveAndFlush(sbUserProfileEntity);
		return sbUserProfileReturn;
	}

	@Override
	public SbUser getUserByUserNameAndPassword(String userName,String password) {
		return sbUserRepo.findByUserNameAndPassword(userName,password);
	}
	
	
	
	
	
}
