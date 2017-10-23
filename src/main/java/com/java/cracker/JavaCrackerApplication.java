package com.java.cracker;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaCrackerApplication {
	 static final Logger logger = LogManager.getLogger(JavaCrackerApplication.class.getName());
	 
	public static void main(String[] args) {
		SpringApplication.run(JavaCrackerApplication.class, args);
	}
}
