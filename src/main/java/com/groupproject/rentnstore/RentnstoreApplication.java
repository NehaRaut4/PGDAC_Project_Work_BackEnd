package com.groupproject.rentnstore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class RentnstoreApplication implements CommandLineRunner {

	@Autowired
	private PasswordEncoder passwordEncoder;
	public static void main(String[] args) {
		SpringApplication.run(RentnstoreApplication.class, args);
	}

	
	
	@Override
	public void run(String... args) throws Exception {
		

		//System.out.println("Encoded Password  -  "+this.passwordEncoder.encode("sneha123"));
		
	}

}
