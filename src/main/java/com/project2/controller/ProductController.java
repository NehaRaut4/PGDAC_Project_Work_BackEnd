package com.project2.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.project2.service.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {

	@Autowired
	private ProductService productService;
	@PostMapping("/add")
	public String addProduct(@RequestParam("file") MultipartFile file,
			@RequestParam("productname") String productname,@RequestParam("producttenureoneprice") float producttenureoneprice,@RequestParam("producttenuretwoprice") float producttenuretwoprice,@RequestParam("producttenurethreeprice") float producttenurethreeprice,@RequestParam("productdiscountone") int productdiscountone,
			@RequestParam("productdiscounttwo") int productdiscounttwo,@RequestParam("productdiscountthree") int productdiscountthree,
			@RequestParam("productcategory") String productcategory,@RequestParam("productsubcategory") String productsubcategory,@RequestParam("productreturnpolicy") String productreturnpolicy,@RequestParam("productquantity") int productquantity,@RequestParam("productmadein") String productmadein,@RequestParam("productdescription") String productdescription,@RequestParam("productdimensions") String productdimensions,
			@RequestParam("productdeposit") int productdeposit
			
			)
			 throws IOException {
		return productService.saveProduct(file, productname,producttenureoneprice,producttenuretwoprice,producttenurethreeprice,productdiscountone,productdiscounttwo,productdiscountthree,productcategory,productsubcategory,productreturnpolicy,productquantity,productmadein,productdescription,productdimensions,productdeposit);
	}
	
}
