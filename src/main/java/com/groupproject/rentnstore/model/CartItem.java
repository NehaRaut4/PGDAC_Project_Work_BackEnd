package com.groupproject.rentnstore.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class CartItem {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cartitemid;
	private int cartquantity;
	private double carttotalprice;
	
	//Relationship with Cart table
	@ManyToOne
	private Cart cart;
	
	@OneToOne
	private Product product;
	
	
	public CartItem() {
		super();
		// TODO Auto-generated constructor stub
	}


	public CartItem(int cartitemid, int cartquantity, double carttotalprice) {
		super();
		this.cartitemid = cartitemid;
		this.cartquantity = cartquantity;
		this.carttotalprice = carttotalprice;
	}


	public int getCartitemid() {
		return cartitemid;
	}


	public void setCartitemid(int cartitemid) {
		this.cartitemid = cartitemid;
	}


	public int getCartquantity() {
		return cartquantity;
	}


	public void setCartquantity(int cartquantity) {
		this.cartquantity = cartquantity;
	}


	public double getCarttotalprice() {
		return carttotalprice;
	}


	public void setCarttotalprice(double carttotalprice) {
		this.carttotalprice = carttotalprice;
	}


	public CartItem(int cartitemid, int cartquantity, double carttotalprice, Cart cart, Product product) {
		super();
		this.cartitemid = cartitemid;
		this.cartquantity = cartquantity;
		this.carttotalprice = carttotalprice;
		this.cart = cart;
		this.product = product;
	}


	public Cart getCart() {
		return cart;
	}


	public void setCart(Cart cart) {
		this.cart = cart;
	}


	public Product getProduct() {
		return product;
	}


	public void setProduct(Product product) {
		this.product = product;
	}
	
	
	
	

}
