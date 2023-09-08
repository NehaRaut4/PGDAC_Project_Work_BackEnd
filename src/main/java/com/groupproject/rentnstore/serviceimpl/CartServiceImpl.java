package com.groupproject.rentnstore.serviceimpl;

import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.groupproject.rentnstore.dto.CartDTO;
import com.groupproject.rentnstore.dto.ItemRequest;
import com.groupproject.rentnstore.exception.ResourceNotFoundException;
import com.groupproject.rentnstore.model.Cart;
import com.groupproject.rentnstore.model.CartItem;
import com.groupproject.rentnstore.model.Product;
import com.groupproject.rentnstore.model.User;
import com.groupproject.rentnstore.repository.CartRepository;
import com.groupproject.rentnstore.repository.ProductRepository;
import com.groupproject.rentnstore.repository.UserRepository;
import com.groupproject.rentnstore.service.CartService;

@Service
public class CartServiceImpl implements CartService {
	
	@Autowired
	private UserRepository userRepo;
	@Autowired
	private ProductRepository productRepo;
	@Autowired
	private CartRepository cartRepo;
	@Autowired
	private ModelMapper mapper;

	
	@Override
	public CartDTO addItem(ItemRequest item, String useremail) {
		int itemid = item.getProductid();
		System.out.println("itemid  "+itemid);
		int itemquantity = item.getQuantity();
		System.out.println("itemquantity  "+itemquantity);
		
		//fetch user
		User user = this.userRepo.findByUseremail(useremail).orElseThrow(()->new ResourceNotFoundException("User Not Found"));
		
		//fetch product
	
		Product product =  this.productRepo.findById(itemid).orElseThrow(()->new ResourceNotFoundException("Product Not Found "+itemid));
		
		//here we checking product stock
		if(!product.isIsstock()) {
			new ResourceNotFoundException("Product Out of Stock!!");
			}
		
		
		//creating cartitem with itemid and itemquantity
		CartItem cartItem = new CartItem();
		//cartItem.setCartitemid(itemid);
		cartItem.setProduct(product);
		cartItem.setCartquantity(itemquantity);
		double totalprice = product.getProductprice()*itemquantity;
		cartItem.setCarttotalprice(totalprice);
		
		
		//getting cart from user
		Cart cart = user.getCart();
		
		if(cart == null) {
			cart = new Cart();
			cart.setUser(user);
		}
		
		Set<CartItem> items = cart.getCartitems();
		//here we check item is available in CartItem or not
		//if CartItem is available then we increase quantity only 
		//Else
		//we will add new product to CartItem
		//By default false
		AtomicReference<Boolean> flag = new AtomicReference<>(false);
		
		Set<CartItem> newproduct = items.stream().map((i)->{
			if(i.getProduct().getProductid()==product.getProductid()) {
				i.setCartquantity(itemquantity);
				i.setCarttotalprice(totalprice);
				flag.set(true);
			}
			return i;
		}).collect(Collectors.toSet());
	
		if(flag.get()) {
			items.clear();
			items.addAll(newproduct);
		}
		else {
			cartItem.setCart(cart);
			items.add(cartItem);
		}
		
		Cart saveCart = this.cartRepo.save(cart);
		CartDTO cartDTO = this.mapper.map(saveCart, CartDTO.class);
		
		return cartDTO;
	}
	
	

}
