package com.sb.main.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.sb.main.entity.CpUser;

public interface CpUserDao extends JpaRepository<CpUser, Integer>{

	List<CpUser> findByUserId(int userId);
	
	@Query("select userName ,userId  from CpUser raf where raf.userId IN ?1 ")
	List<Object[]> findInUserId(List<Integer> userIds);

}
