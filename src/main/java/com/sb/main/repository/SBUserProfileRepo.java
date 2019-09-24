package com.sb.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sb.main.entity.SbUserProfile;

public interface SBUserProfileRepo extends JpaRepository<SbUserProfile, Integer>{

}
