package com.yicj.study.cloud2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;


@SpringBootApplication
public class EurekaConsumerApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(EurekaConsumerApplication.class, args) ;
	}
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
	
}
