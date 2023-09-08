package com.groupproject.rentnstore.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class Cart {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cartid;
	
	//Relationship with CartItem table
	@JsonManagedReference
	@OneToMany(mappedBy ="cart",cascade = CascadeType.ALL)
	private Set<CartItem> cartitems = new HashSet<>();
	
	@OneToOne
	private User user;

	public Cart() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Cart(int cartid) {
		super();
		this.cartid = cartid;
	}
	
	
   public Cart(int cartid, Set<CartItem> cartitems) {
		super();
		this.cartid = cartid;
		this.cartitems = cartitems;
	}



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



	public Cart(int cartid, Set<CartItem> cartitems, User user) {
		super();
		this.cartid = cartid;
		this.cartitems = cartitems;
		this.user = user;
	}
	
	
	

}
