package com.system.dealership;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class DealershipApplication {

	public static void main(String[] args) {
		SpringApplication.run(DealershipApplication.class, args);
	}

}
