package com.flamexander.cloud.client.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableFeignClients
@ComponentScan({"com.flamexander.cloud.client"})
@EntityScan({"com.flamexander.cloud.client.entity"})
public class GeekEurekaFeignClientApplication {
	public static void main(String[] args) {
		SpringApplication.run(GeekEurekaFeignClientApplication.class, args);
	}
}

