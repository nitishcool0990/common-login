package com.sb.main.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sb.main.entity.SbUser;

public interface SbUserDao extends JpaRepository<SbUser, Integer> {

}
