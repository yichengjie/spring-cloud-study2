package com.yicj.study.cloud2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.context.annotation.Bean;

import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;

//https://blog.csdn.net/yeyinglingfeng/article/details/83994064
@EnableHystrixDashboard
@SpringBootApplication
public class DashboardHystrixApplication {
	public static void main(String[] args) {
		SpringApplication.run(DashboardHystrixApplication.class, args) ;
	}
	//spring boot 2.X
	//http://localhost:2005/hystrix.stream
	@Bean
    public ServletRegistrationBean<HystrixMetricsStreamServlet> getServlet(){
        HystrixMetricsStreamServlet streamServlet = new HystrixMetricsStreamServlet();
        ServletRegistrationBean<HystrixMetricsStreamServlet> registrationBean 
        	= new ServletRegistrationBean<HystrixMetricsStreamServlet>(streamServlet);
        registrationBean.setLoadOnStartup(1);
        registrationBean.addUrlMappings("/hystrix.stream");
        registrationBean.setName("HystrixMetricsStreamServlet");
        return registrationBean;
    }
}
