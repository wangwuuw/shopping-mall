package com.beidoudxt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulServer;

@SpringBootApplication
@EnableEurekaClient
@EnableZuulServer
public class ZuulApp {

	public static void main(String[] args) {
		SpringApplication.run(ZuulApp.class, args);

	}

}
