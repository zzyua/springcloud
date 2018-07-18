package com.moll.ribbon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
//hystrix-ribbon-2
@EnableHystrix
//Hystrix-Dashboard-2   访问地址 host:port/hystrix
@EnableHystrixDashboard
public class RibbonApplication {



	public static void main(String[] args) {
		SpringApplication.run(RibbonApplication.class, args);
	}


	/**
	 * 注册RestTemplate
	 * RestTemplate + Ribbon  组合实现： 服务消费者
	 * @LoadBalanced 开启负载均衡
	 * @return  restTemplate
	 */
	@Bean
	@LoadBalanced
	RestTemplate restTemplate(){
		return  new RestTemplate() ;
	}
}
