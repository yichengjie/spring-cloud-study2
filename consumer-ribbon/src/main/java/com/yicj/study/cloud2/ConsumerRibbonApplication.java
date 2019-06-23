package com.yicj.study.cloud2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;


@SpringBootApplication
public class ConsumerRibbonApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(ConsumerRibbonApplication.class, args) ;
	}
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
	
}
