package com.sb.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.sb.main.entity.SbDailyStock;


public interface SBDailyStockRepo extends JpaRepository<SbDailyStock , Integer>{

}
