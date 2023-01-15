package com.mourad.portfolio.movieapp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mourad.portfolio.movieapp.entities.User;
import com.mourad.portfolio.movieapp.repositories.ProductRepository;
import com.mourad.portfolio.movieapp.repositories.UserRepository;

@SpringBootApplication
public class MovieappApplication implements CommandLineRunner{

	@Autowired
	private ProductRepository productRepository;
	
	@Autowired
	private UserRepository userRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(MovieappApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
	}

	

}
