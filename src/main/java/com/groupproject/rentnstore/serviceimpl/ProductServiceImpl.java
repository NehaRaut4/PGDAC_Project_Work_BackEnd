package com.groupproject.rentnstore.serviceimpl;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.groupproject.rentnstore.model.Product;
import com.groupproject.rentnstore.repository.ProductRepository;
import com.groupproject.rentnstore.service.ProductService;


@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	private ProductRepository productRepo; 
	
	@Override
	public Product saveProduct(MultipartFile file, String productname, double productprice, int productdiscount,
			String productdesc, String productcategory, String producttype, String productdim, String productreturnp,
			int productquantity, int productdeposit,boolean isstock) throws IOException {
		
		
		Product product = new Product();
         product.setProductname(productname);
         product.setProductprice(productprice);
         product.setProductdiscount(productdiscount);
         product.setProductdesc(productdesc);
         product.setProductcategory(productcategory);
         product.setProducttype(producttype);
         product.setProductdim(productdim);
         product.setProductreturnp(productreturnp);
         product.setProductquantity(productquantity);
         product.setProductdeposit(productdeposit);
         product.setProductimage(file.getBytes());
         product.setIsstock(isstock);
         
         productRepo.save(product);
	
         
		
		return product;
	}

	@Override
	public List<Product> getAllProducts() {
		
		List<Product> list = productRepo.findAll();
		
		return list;
	}

	@Override
	public Optional<Product> getProductById(int productid) {
		
		Optional<Product> product = productRepo.findById(productid);
	
		return product;
	}

	@Override
	public List<Product> getProductsByCategory(String productcategory) {
		
		List<Product> list = productRepo.findAllByCategory(productcategory);
		return list;
	}

	@Override
	public List<Product> getProductsByType(String producttype) {
		List<Product> list = productRepo.findAllByType(producttype);
		return list;
	}

	@Override
	public Product updateProductById(int productid, Product newproduct) {
		
		Product product = productRepo.findByproductid(productid);
		product.setProductname(newproduct.getProductname());
		product.setProductprice(newproduct.getProductprice());
		product.setProductdiscount(newproduct.getProductdiscount());
		product.setProductdesc(newproduct.getProductdesc());
		product.setProductcategory(newproduct.getProductcategory());
	    product.setProducttype(newproduct.getProducttype());
	    product.setProductdim(newproduct.getProductdim());
	    product.setProductreturnp(newproduct.getProductreturnp());
	    product.setProductimage(newproduct.getProductimage());
	    product.setProductdeposit(newproduct.getProductdeposit());
	    product.setProductquantity(newproduct.getProductquantity());
	    product.setIsstock(newproduct.isIsstock());
	    
	    productRepo.save(product);
	    
		
		return product;
	}

	@Override
	public List<Product> deleteProductById(int productid) {
		Product product = productRepo.findByproductid(productid);
		productRepo.delete(product);
		List<Product> list = productRepo.findAll();
		return list;
		
	}

	/*
	 * @Override public Product saveProduct(MultipartFile file, String productname,
	 * double productprice, int productdiscount, String productdesc, String
	 * productcategory, String producttype, String productdim, String
	 * productreturnp, int productquantity, int productdeposit) throws IOException {
	 * // TODO Auto-generated method stub return null; }
	 */

	


}
