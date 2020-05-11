package com.sb.main.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.sb.main.entity.UserLoginDetails;

public interface UserRepository extends JpaRepository<UserLoginDetails, Integer>{
 
	public List<UserLoginDetails> findByWatsappNum(String whatsappNumber);
	
	@Query("from SbUser raf where raf.clientName=:userName and raf.password=:password ")
	public UserLoginDetails findByUserNameAndPassword(String userName,String password);
}
