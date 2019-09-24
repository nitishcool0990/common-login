package com.sb.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.sb.main.entity.SbItem;

public interface SBItemRepo extends JpaRepository<SbItem , Integer> {

}
