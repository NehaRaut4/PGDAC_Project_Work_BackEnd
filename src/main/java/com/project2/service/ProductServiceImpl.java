package com.project2.service;

import java.io.IOException;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import com.project2.entity.Product;
import com.project2.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository productRepository; 
	
	//Adding products to product table
	@Override
	public String saveProduct(MultipartFile file, String productname, float producttenureoneprice,
			float producttenuretwoprice, float producttenurethreeprice, int productdiscountone, int productdiscounttwo,
			int productdiscountthree, String productcategory, String productsubcategory, String productreturnpolicy,
			int productquantity, String productmadein, String productdescription,String productdimensions,int productdeposit) throws IOException {
		// TODO Auto-generated method stub
		
		Product product = new Product();
		product.setProductname(productname);
		product.setProductpicture(file.getBytes());
		product.setProducttenureoneprice(producttenureoneprice);
		product.setProducttenuretwoprice(producttenuretwoprice);
		product.setProducttenurethreeprice(producttenurethreeprice);
		product.setProductdiscountone(productdiscountone);
		product.setProductdiscounttwo(productdiscounttwo);
		product.setProductdiscountthree(productdiscountthree);
		product.setProductcategory(productcategory);
		product.setProductsubcategory(productsubcategory);
		product.setProductreturnpolicy(productreturnpolicy);
		product.setProductquantity(productquantity);
		product.setProductmadein(productmadein);
		product.setProductdescription(productdescription);
		productRepository.save(product);

		return "Image saved to the DB";
	}








}
