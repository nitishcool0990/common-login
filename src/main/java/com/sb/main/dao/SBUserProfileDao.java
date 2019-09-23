package com.sb.main.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sb.main.entity.SbUserProfile;

public interface SBUserProfileDao extends JpaRepository<SbUserProfile, Integer>{

}
