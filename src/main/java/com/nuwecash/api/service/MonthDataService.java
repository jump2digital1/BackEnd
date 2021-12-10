package com.nuwecash.api.service;

import com.nuwecash.api.dto.MonthsGraficsDto;
import com.nuwecash.api.model.Month;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MonthDataService {
    @Autowired
    MonthService monthService;
    public List<MonthsGraficsDto> getGraficsData(){
        List<Month> months = monthService.getAllMonths();
        List<MonthsGraficsDto> monthsGraficsDtos = new ArrayList<>();
        for(Month m: months){
          monthsGraficsDtos.add(new MonthsGraficsDto());
        }
        return monthsGraficsDtos;
    };
}
