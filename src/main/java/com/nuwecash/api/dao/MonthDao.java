package com.nuwecash.api.dao;

import com.nuwecash.api.model.Month;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MonthDao extends JpaRepository<Month, Integer> {

    Optional<Month> findById(String id);
}
