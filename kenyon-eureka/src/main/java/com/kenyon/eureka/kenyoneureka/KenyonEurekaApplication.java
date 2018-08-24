package com.kenyon.eureka.kenyoneureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class KenyonEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(KenyonEurekaApplication.class, args);
	}
}
