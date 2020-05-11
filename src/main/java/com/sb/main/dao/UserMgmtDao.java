package com.sb.main.dao;
import com.sb.main.entity.UserLoginDetails;
import com.sb.main.entity.SbUserProfile;

public interface UserMgmtDao  {
	
	public abstract UserLoginDetails getUserByID(int id);
	public abstract SbUserProfile getUserProfileByUserId(int id);
	public UserLoginDetails createUser(UserLoginDetails sbUserEntity);
	public SbUserProfile createUserProfile(SbUserProfile sbUserProfileEntity);
	public UserLoginDetails getUserByUserNameAndPassword(String userName,String password);


}
