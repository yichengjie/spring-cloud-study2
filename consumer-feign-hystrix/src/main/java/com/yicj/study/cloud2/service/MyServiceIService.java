package com.yicj.study.cloud2.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Component
@FeignClient("client-eureka")
public interface MyServiceIService {
	
	@GetMapping("/dc")
	@ResponseBody
	public String dc() ;
	
	@GetMapping("/dc2")
	@ResponseBody
	public String dc2() ;
}
