package com.groupproject.rentnstore.service;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

import org.springframework.web.multipart.MultipartFile;

import com.groupproject.rentnstore.model.Product;



public interface ProductService {
	/*
	 * public Product saveProduct(MultipartFile file, String productname, double
	 * productprice, int productdiscount, String productdesc, String
	 * productcategory, String producttype, String productdim, String
	 * productreturnp, int productquantity, int productdeposit) throws IOException;
	 */
	public List<Product> getAllProducts();

	public Optional<Product> getProductById(int productid);

	public List<Product> getProductsByCategory(String productcategory);

	public List<Product> getProductsByType(String producttype);

	public Product updateProductById(int productid, Product newproduct);

	public List<Product> deleteProductById(int productid);

	Product saveProduct(MultipartFile file, String productname, double productprice, int productdiscount,
			String productdesc, String productcategory, String producttype, String productdim, String productreturnp,
			int productquantity, int productdeposit, boolean isstock) throws IOException;

}
