package com.yicj.study.cloud2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class DcController {
	@Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping("/dc")
    public String dc() {
        String services = "Services: " + discoveryClient.getServices();
        return services ;
    }
    
    @GetMapping("/dc2")
    public String dc2() {
        String services = "Services: " + discoveryClient.getServices();
        try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			log.error("dc2 error : ", e);
		}
        return services ;
    }
}
