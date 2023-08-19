package com.project2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project2.entity.Product;

public interface ProductRepository extends JpaRepository<Product,Integer> {
	
	

}
