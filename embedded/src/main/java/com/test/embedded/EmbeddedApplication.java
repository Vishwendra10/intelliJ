package com.test.embedded;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EmbeddedApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmbeddedApplication.class, args);
	}

}
