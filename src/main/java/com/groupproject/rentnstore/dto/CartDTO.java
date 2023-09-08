package com.groupproject.rentnstore.dto;

import java.util.HashSet;
import java.util.Set;
import com.groupproject.rentnstore.model.CartItem;
import com.groupproject.rentnstore.model.User;

public class CartDTO {
	
    private int cartid;
	private Set<CartItem> cartitems = new HashSet<>();
	private User user;
	public int getCartid() {
		return cartid;
	}
	public void setCartid(int cartid) {
		this.cartid = cartid;
	}
	public Set<CartItem> getCartitems() {
		return cartitems;
	}
	public void setCartitems(Set<CartItem> cartitems) {
		this.cartitems = cartitems;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public CartDTO(int cartid, Set<CartItem> cartitems, User user) {
		super();
		this.cartid = cartid;
		this.cartitems = cartitems;
		this.user = user;
	}
	
	

}
