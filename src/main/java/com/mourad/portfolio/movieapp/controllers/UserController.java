package com.mourad.portfolio.movieapp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mourad.portfolio.movieapp.entities.User;
import com.mourad.portfolio.movieapp.repositories.UserRepository;

@RestController
public class UserController {
	
	@Autowired
	private UserRepository userRepository;
	
	@GetMapping("/users")
	public User users(){
		return userRepository.findByfirstName("Amami");
	}
}
