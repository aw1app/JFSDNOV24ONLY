package com.sl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.sl","com.sl.entities", "com.sl.controllers", "com.sl.respositries"})
public class SpringBootDataJpaDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDataJpaDemoApplication.class, args);
	}

}
