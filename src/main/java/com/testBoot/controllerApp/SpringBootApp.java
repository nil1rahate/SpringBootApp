package com.testBoot.controllerApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SpringBootApp {
	
	public static void main(String[] args) {
		System.setProperty("server.servlet.context-path", "/SpringBootWithHibernet");
		SpringApplication.run(SpringBootApp.class, args);
	}
	

}
