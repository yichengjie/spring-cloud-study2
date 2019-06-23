package com.yicj.study.cloud2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yicj.study.cloud2.service.MyServiceIService;

@RestController
@RequestMapping("/CApi")
public class MyCustomerController {
	
	@Autowired
	private MyServiceIService myServiceIService ;
	
	@GetMapping("/dc")
	public String dc() {
		return myServiceIService.dc() ;
	}
	
}
