package com.sb.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sb.main.entity.SbUser;

public interface SBUserRepository extends JpaRepository<SbUser, Integer>{

}
