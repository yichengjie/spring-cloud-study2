package com.yicj.study.cloud2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
//http://blog.didispace.com/spring-cloud-learning/
//https://blog.csdn.net/yeyinglingfeng/article/details/83821059
@EnableEurekaServer
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class EurekaServerApplication {
	
	public static void main(String[] args) {
        SpringApplication.run(EurekaServerApplication.class, args);
    }
}
