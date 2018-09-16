package com;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.SecurityAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"org.activiti","com"})
@EnableAutoConfiguration(exclude={SecurityAutoConfiguration.class})
public class SpringbootactivititestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootactivititestApplication.class, args);
	}

}
