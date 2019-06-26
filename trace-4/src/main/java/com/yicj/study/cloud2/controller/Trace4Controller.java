package com.yicj.study.cloud2.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class Trace4Controller {
	
	@GetMapping("/trace-4")
    public String trace(HttpServletRequest request) {
		log.info("===<call trace-4, TraceId={}, SpanId={}>===",
				request.getHeader("X-B3-TraceId"), request.getHeader("X-B3-SpanId"));
    	return "Trace";
    }
}
