package com.sb.main.dao;

import java.util.List;

import com.sb.main.entity.UserLoginDetails;
import com.sb.main.entity.SbUserProfile;

public interface SbUserDetailDao  {
	
	public abstract UserLoginDetails getUserByID(int id);
	public abstract SbUserProfile getUserProfileByUserId(int id);
	public List<UserLoginDetails> getUserByWhatsappNumber(String whatsappNumber);

}
