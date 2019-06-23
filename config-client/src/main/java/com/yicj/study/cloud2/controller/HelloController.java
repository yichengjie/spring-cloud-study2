package com.yicj.study.cloud2.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class HelloController {
	@Value("${test}")
	private String test ;
	
	@GetMapping("/hello")
	public String hello() {
		
		return "hello " + test ;
	}
}
