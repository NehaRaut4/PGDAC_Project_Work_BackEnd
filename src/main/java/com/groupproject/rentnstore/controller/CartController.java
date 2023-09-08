package com.groupproject.rentnstore.controller;

import java.security.Principal;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.groupproject.rentnstore.dto.CartDTO;
import com.groupproject.rentnstore.dto.ItemRequest;
import com.groupproject.rentnstore.repository.CartRepository;
import com.groupproject.rentnstore.service.CartService;

@RestController
@RequestMapping("/carts")
public class CartController {
	
	@Autowired
	private CartRepository cartRepo;
	
	@Autowired
	private CartService cartService;
	//adding product to cart
	@PostMapping("/addToCart")
	public ResponseEntity<CartDTO> addToCart(ItemRequest item,Principal principal){
		
		String useremail = principal.getName();
		System.out.println("Useremail  "+useremail);
		CartDTO additem = this.cartService.addItem(item, useremail);
		return ResponseEntity.of(Optional.of(additem));
		
	}
	
	

}
