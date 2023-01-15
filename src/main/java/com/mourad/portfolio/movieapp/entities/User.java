package com.mourad.portfolio.movieapp.entities;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Table(name = "user")
@Data @AllArgsConstructor @ToString @NoArgsConstructor
@Entity
public class User implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_user")
	private Long id; 
		@Column(name = "first_name")
	private String firstName;
		@Column(name = "last_name")
	private String lastName;
		@Column(name = "email")
	private String email;
		@Column(name = "password")
	private String password;
	
}
