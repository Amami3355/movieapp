package com.mourad.portfolio.movieapp.entities;

import java.io.Serializable;

import jakarta.persistence.Access;
import jakarta.persistence.AccessType;
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



@Table(name = "Product")
@Entity
@Access(AccessType.FIELD)
@Data @ToString @NoArgsConstructor @AllArgsConstructor
public class Product implements Serializable{

	@Id @Column(name = "id_product")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
}
