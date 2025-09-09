package com.example.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;


@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class JoonghoonApplication {

	public static void main(String[] args) {
		System.out.println("................?");
		SpringApplication.run(JoonghoonApplication.class, args);
	}

}
