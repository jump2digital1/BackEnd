package com.nuwecash.api.service;

import com.nuwecash.api.dao.MonthDao;
import com.nuwecash.api.model.Month;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MonthService {
    @Autowired
    MonthDao monthDao;

    public List<Month> getAllMonths(){
        return monthDao.findAll();
    }
    public Month getMonth(String id) throws Exception {
        Month month = monthDao.findById(id).get();
        if(month == null){
            throw new Exception("Month does not exist");
        }
        return month;
    }
    public void postMonth(Month month){
        monthDao.save(month);
    }
    public void updateMonth(Month month){
        monthDao.save(month);
    }
    public void deleteMonth(String id) throws Exception {
        Month month = monthDao.findById(id).get();
        if(month == null){
            throw new Exception("Month does not exist");
        }
    }
}
