package com.cursoluv2code.springcoredemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// Añadida nueva configuración de escaneo de paquetes
/*
@SpringBootApplication (
		scanBasePackages = {"com.cursoluv2code.springcoredemo",
							"com.cursoluv2code.util"}
)
*/
@SpringBootApplication
public class SpringCoreDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCoreDemoApplication.class, args);
	}

}
