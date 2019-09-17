package com.sb.main.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.sb.main.entity.CpUserProfile;


public interface CpUserProfileDao extends JpaRepository<CpUserProfile, Integer>{

	@Query("select userId,CONCAT(firstName,' ',lastName) as fullName  from CpUserProfile raf where raf.userId IN ?1 ")
	public List<Object[]> findFullNameByIds(List<Integer> userIds);
}
