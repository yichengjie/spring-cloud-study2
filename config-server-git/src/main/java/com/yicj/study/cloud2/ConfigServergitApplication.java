package com.yicj.study.cloud2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
@EnableDiscoveryClient
public class ConfigServergitApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(ConfigServergitApplication.class, args) ;
	}

}
