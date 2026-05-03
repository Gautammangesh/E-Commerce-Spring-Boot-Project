package com.example.EcommerceSpringApplication;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EcommerceSpringApplication {

	public static void main(String[] args) {

        // 1. Load the .env file
        Dotenv dotenv = Dotenv.configure().load();

        // 2. Iterate through each entry and set it as a system property
        dotenv.entries().forEach(entry -> {
            System.setProperty(entry.getKey(), entry.getValue());
        });

        SpringApplication.run(EcommerceSpringApplication.class, args);
	}

}
