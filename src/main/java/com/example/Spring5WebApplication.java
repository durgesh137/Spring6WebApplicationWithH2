package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Spring5WebApplication {

	public static void main(String[] args) {
		SpringApplication.run(Spring5WebApplication.class, args);
	}

}

/**
 * JDL-Studio
 * Author -> firstName, lastname
 * Book -> title, isbn
 * Book-> n:n relationship -> Author
 * 
 * Establishing many-to-many relationship among both entities
 * 
 * Repository pattern is used with Spring data JPA
 */
