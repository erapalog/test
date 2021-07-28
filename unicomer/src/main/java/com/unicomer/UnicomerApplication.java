package com.unicomer;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan({ "com.unicomer"})
@SpringBootApplication
public class UnicomerApplication {

	public static void main(String[] args) {
		SpringApplication.run(UnicomerApplication.class, args);
	
	}
	
}
