package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	/*@Autowired
	private PasswordEncoder passwordEncoder;


	@Bean
	public CommandLineRunner createdPasswordEncoder(){
		return args -> {
			System.out.println(passwordEncoder.encode("Clave123"));
			System.out.println(passwordEncoder.encode("Clave456"));
		};
	}*/
}
