package com.groupproject.rentnstore.controller;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.groupproject.rentnstore.model.Product;
import com.groupproject.rentnstore.service.ProductService;


@RestController
@RequestMapping("/products")
public class ProductController {
	@Autowired
	private ProductService productService;
	
	@PostMapping("/add")
	public ResponseEntity<Product> saveProduct(@RequestParam("file") MultipartFile file,
			@RequestParam("productname") String productname,@RequestParam("productprice") double productprice,@RequestParam("productdiscount") int productdiscount,
			@RequestParam("productdesc") String productdesc,@RequestParam("productcategory") String productcategory,@RequestParam("producttype") String producttype,@RequestParam("productdim") String productdim,@RequestParam("productreturnp") String productreturnp,@RequestParam("productquantity") int productquantity,@RequestParam("productdeposit") int productdeposit,@RequestParam("isstock") boolean isstock
			) throws IOException{
		
		Product product = productService.saveProduct(file,productname,productprice,productdiscount,productdesc,productcategory,producttype,productdim,productreturnp,productquantity,productdeposit,isstock);
		
		return ResponseEntity.of(Optional.of(product));
		
	}
	
	//getting all products
	@GetMapping("/getAllProducts")
    public ResponseEntity<List<Product>> getAllProducts(){
		List<Product> list = productService.getAllProducts();
		if(list.size()<=0)
		{
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.of(Optional.of(list));
		
	}
	
	//getting product by productid
    @GetMapping("/getProductById/{productid}")
    public ResponseEntity<Optional<Product>> getProductById(@PathVariable int productid){
    	
    	Optional<Product> product = productService.getProductById(productid);
    	return ResponseEntity.of(Optional.of(product));
		}
    
    //getting product by ProductCategory
    @GetMapping("/getProductsByCategory/{productcategory}")
    public ResponseEntity<List<Product>> getProductsByCategory(@PathVariable String productcategory){
    	
    	List<Product> list = productService.getProductsByCategory(productcategory);
    	return ResponseEntity.of(Optional.of(list));
    }
    
  //getting product by ProductType
    @GetMapping("/getProductsByType/{producttype}")
    public ResponseEntity<List<Product>> getProductsByType(@PathVariable String producttype){
    	
    	List<Product> list = productService.getProductsByType(producttype);
    	return ResponseEntity.of(Optional.of(list));
    }
    
    //updating product 
    @PutMapping("/updateProductById/{productid}")
    public ResponseEntity<Product> updateProductById(@PathVariable int productid,@RequestBody Product newproduct){
    	
    	Product product = productService.updateProductById(productid,newproduct);
    	return ResponseEntity.of(Optional.of(product));
		}
    
    //deleting product by productid
    @DeleteMapping("/deleteProductById/{productid}")
public ResponseEntity<List<Product>> deleteProductById(@PathVariable int productid){
    	
    	List<Product> list = productService.deleteProductById(productid);
    	return ResponseEntity.of(Optional.of(list));
    }
 

}
