package com.yicj.study.cloud2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
//https://blog.csdn.net/forezp/article/details/83792388
@SpringBootApplication
@EnableZuulProxy
@EnableEurekaClient
//@EnableAutoConfiguration(exclude = {SecurityAutoConfiguration.class})
public class GatewayZuulApplication {
	public static void main(String[] args) {
		SpringApplication.run(GatewayZuulApplication.class, args);
	}
}
