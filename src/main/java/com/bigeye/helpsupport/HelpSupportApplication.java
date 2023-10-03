package com.bigeye.helpsupport;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class HelpSupportApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelpSupportApplication.class, args);
	}

}
