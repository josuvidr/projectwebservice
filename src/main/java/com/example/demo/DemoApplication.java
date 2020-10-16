package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		//Serveur WEB Tomcat
		SpringApplication.run(DemoApplication.class, args);
	}
}
