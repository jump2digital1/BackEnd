package com.nuwecash.api.controller;

import com.nuwecash.api.model.Month;
import com.nuwecash.api.service.MonthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/nuwecash")
public class MonthController {

    @Autowired
    MonthService monthService;
    @GetMapping("/month")
    public void getMonth(){

    }
    @PostMapping("/month")
    public void postMonth(Month month){

    }
    @PutMapping("/month")
    public void updateMonth(Month month){

    }
    @DeleteMapping("/month")
    public void deleteMonth(int id){

    }
}
