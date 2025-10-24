package com.klu.car;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CarBackendApplication{

	public static void main(String[] args) {
		SpringApplication.run(CarBackendApplication.class, args);
		System.out.println("backend running");
	}

}
