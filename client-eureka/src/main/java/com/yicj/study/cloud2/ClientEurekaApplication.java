package com.yicj.study.cloud2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ClientEurekaApplication {
	public static void main(String[] args) {
		SpringApplication.run(ClientEurekaApplication.class, args) ;
	}
}
