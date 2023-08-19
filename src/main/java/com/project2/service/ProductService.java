package com.project2.service;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

import org.springframework.web.multipart.MultipartFile;

import com.project2.entity.Product;

public interface ProductService {
	
	public String saveProduct(MultipartFile file, String productname, float producttenureoneprice, float producttenuretwoprice, float producttenurethreeprice, int productdiscountone, int productdiscounttwo, int productdiscountthree, String productcategory, String productsubcategory, String productreturnpolicy, int productquantity, String productmadein, String productdescription, String productdimensions, int productdeposit) throws IOException;	
	
	/*
	 * public List<Product> getAllProducts();
	 * 
	 * public Optional<Product> getProductById(Integer id);
	 */
}
