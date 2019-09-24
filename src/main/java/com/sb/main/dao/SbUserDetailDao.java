package com.sb.main.dao;

import com.sb.main.entity.SbUser;
import com.sb.main.entity.SbUserProfile;

public interface SbUserDetailDao  {
	
	public abstract SbUser getUserByID(int id);
	public abstract SbUserProfile getUserProfileByUserId(int id);

}