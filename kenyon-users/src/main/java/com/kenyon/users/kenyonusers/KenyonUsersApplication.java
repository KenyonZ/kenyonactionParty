package com.kenyon.users.kenyonusers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class KenyonUsersApplication {

	public static void main(String[] args) {
		SpringApplication.run(KenyonUsersApplication.class, args);
	}
}
