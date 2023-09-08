package com.groupproject.rentnstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.groupproject.rentnstore.dto.CartDTO;
import com.groupproject.rentnstore.dto.ItemRequest;
import com.groupproject.rentnstore.model.Cart;

@Repository
public interface CartRepository extends JpaRepository<Cart,Integer> {

	



	
}
