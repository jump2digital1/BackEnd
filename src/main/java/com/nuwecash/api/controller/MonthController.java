package com.nuwecash.api.controller;

import com.nuwecash.api.dao.MonthDao;
import com.nuwecash.api.model.Month;
import com.nuwecash.api.service.MonthService;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class MonthController {

   @Autowired
   private MonthService monthService;
    
    @GetMapping("/month/{nameuud}")
    public ResponseEntity<Month> getMonth(@PathVariable("nameuud")String id){
    	
    try {
		Month month= monthService.getMonth(id);
		return ResponseEntity.ok(month);
	} catch (Exception e) {
		return ResponseEntity.noContent().build();
	}
    	
    	

    }
    @PostMapping("/month")
    public ResponseEntity<Month> postMonth(Month month){

    	monthService.postMonth(month);
    	return ResponseEntity.ok(month);
    	
    }
    @PutMapping("/month")
    public ResponseEntity<Month> updateMonth(Month month){
    	monthService.updateMonth(month);
		return ResponseEntity.ok(month);
    }
    @DeleteMapping("/month/{nameuud}")
    public ResponseEntity<String> deleteMonth(@PathVariable("nameuud")String id){
    	try {
    		monthService.deleteMonth(id);
			return ResponseEntity.ok("Deleted!");
		} catch (Exception e) {
			return ResponseEntity.notFound().build();
		}

    }
}
