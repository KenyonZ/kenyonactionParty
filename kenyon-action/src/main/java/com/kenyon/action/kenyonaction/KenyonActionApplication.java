package com.kenyon.action.kenyonaction;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class KenyonActionApplication {

	public static void main(String[] args) {
		SpringApplication.run(KenyonActionApplication.class, args);
	}
}
