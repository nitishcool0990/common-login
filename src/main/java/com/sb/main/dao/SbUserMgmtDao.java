package com.sb.main.dao;
import com.sb.main.entity.SbUser;
import com.sb.main.entity.SbUserProfile;

public interface SbUserMgmtDao  {
	
	public abstract SbUser getUserByID(int id);
	public abstract SbUserProfile getUserProfileByUserId(int id);
	public SbUser createUser(SbUser sbUserEntity);
	public SbUserProfile createUserProfile(SbUserProfile sbUserProfileEntity);
	public SbUser getUserByUserNameAndPassword(String userName,String password);


}
