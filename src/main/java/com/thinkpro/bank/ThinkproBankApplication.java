package com.thinkpro.bank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ThinkproBankApplication {

	public static void main(String[] args) {
		SpringApplication.run(ThinkproBankApplication.class, args);
	}
}
