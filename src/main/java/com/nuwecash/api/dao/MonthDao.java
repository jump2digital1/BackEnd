package com.nuwecash.api.dao;

import com.nuwecash.api.model.Month;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import java.util.Optional;

import javax.transaction.Transactional;
@Repository
public interface MonthDao extends JpaRepository<Month, String> {

    Optional<Month> findById(String id);
}
