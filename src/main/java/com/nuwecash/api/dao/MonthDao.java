package com.nuwecash.api.dao;

import com.nuwecash.api.model.Month;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MonthDao extends JpaRepository<Month, Integer> {

}
