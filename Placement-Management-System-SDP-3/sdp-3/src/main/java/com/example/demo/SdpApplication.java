package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
public class SdpApplication {

	public static void main(String[] args) {
		SpringApplication.run(SdpApplication.class, args);
	}

}
