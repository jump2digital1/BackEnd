package com.nuwecash.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nuwecash.api.dto.MonthData;
import com.nuwecash.api.dto.MonthsGraficsDto;
import com.nuwecash.api.service.MonthDataService;
@RestController
@RequestMapping("/api")
public class MonthDataController {

	@Autowired 
	MonthDataService service;
	
	@GetMapping("/months/{UUID}")
	public MonthData getMonthData(@PathVariable String UUID) {
		try {
			return service.getMonthData(UUID);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	@GetMapping("/months/graphics")
	public List<MonthsGraficsDto> getGraficsDto() {
	
		
		return service.getGraficsData();
		
	}
	
}
