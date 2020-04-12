package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.example.customer")
public class CrudOprectionApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrudOprectionApplication.class, args);
	}

}
