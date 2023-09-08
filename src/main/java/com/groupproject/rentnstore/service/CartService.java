package com.groupproject.rentnstore.service;

import com.groupproject.rentnstore.dto.CartDTO;
import com.groupproject.rentnstore.dto.ItemRequest;

public interface CartService {

	public CartDTO addItem(ItemRequest item, String useremail);

	
	
	

}
