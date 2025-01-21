package com.alquileres.alquileres;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AlquileresApplication {

	public static void main(String[] args) {
		SpringApplication.run(AlquileresApplication.class, args);
		System.out.println("Spring boot application FUCK THA SHIT running in UTC timezone :"+new Date());
	}

}
