package com.sb.main.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.sb.main.entity.SbUser;

public interface SBUserRepository extends JpaRepository<SbUser, Integer>{
 
	public List<SbUser> findByWatsappNum(String whatsappNumber);
	
	@Query("from SbUser raf where raf.clientName=:userName and raf.password=:password ")
	public SbUser findByUserNameAndPassword(String userName,String password);
}
