package com.mourad.portfolio.movieapp.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import com.mourad.portfolio.movieapp.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	
		public List<Product> findByNameContains(String name);
		public List<Product> findByName(String name);
		
		

}
