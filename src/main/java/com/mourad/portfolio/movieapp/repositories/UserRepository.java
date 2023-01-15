package com.mourad.portfolio.movieapp.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mourad.portfolio.movieapp.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	public User findByfirstNameAndLastName(String firstName, String lastName);
	public User findByfirstName(String firstName);
}
