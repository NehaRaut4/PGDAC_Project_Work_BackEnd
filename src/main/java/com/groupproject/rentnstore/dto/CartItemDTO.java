package com.groupproject.rentnstore.dto;

import com.groupproject.rentnstore.model.Product;

public class CartItemDTO {

	private int cartitemid;
	private int cartquantity;
	private double carttotalprice;
	private CartDTO cart;
	private Product product;
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
	public CartDTO getCart() {
		return cart;
	}
	public void setCart(CartDTO cart) {
		this.cart = cart;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public CartItemDTO(int cartitemid, int cartquantity, double carttotalprice, CartDTO cart, Product product) {
		super();
		this.cartitemid = cartitemid;
		this.cartquantity = cartquantity;
		this.carttotalprice = carttotalprice;
		this.cart = cart;
		this.product = product;
	}
	
}
