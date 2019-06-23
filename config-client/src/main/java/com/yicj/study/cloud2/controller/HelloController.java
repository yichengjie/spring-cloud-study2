package com.yicj.study.cloud2.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@Value("${test}")
	private String test ;
	
	@GetMapping("/hello")
	public String hello() {
		
		return "hello " + test ;
	}
}
