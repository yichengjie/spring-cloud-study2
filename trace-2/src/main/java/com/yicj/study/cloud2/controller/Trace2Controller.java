package com.yicj.study.cloud2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class Trace2Controller {
	
	@GetMapping("/trace-2")
    public String trace() {
		log.info("===<call trace-2>===");
    	return "Trace";
    }
}
