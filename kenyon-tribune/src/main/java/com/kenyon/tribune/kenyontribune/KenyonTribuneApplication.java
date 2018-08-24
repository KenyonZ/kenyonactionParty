package com.kenyon.tribune.kenyontribune;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class KenyonTribuneApplication {

	public static void main(String[] args) {
		SpringApplication.run(KenyonTribuneApplication.class, args);
	}
}
