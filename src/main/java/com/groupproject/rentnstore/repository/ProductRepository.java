package com.groupproject.rentnstore.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.groupproject.rentnstore.model.Product;
import com.groupproject.rentnstore.model.User;


@Repository
public interface ProductRepository extends JpaRepository<Product,Integer> {
	
	@Query(value = "select * from Product p where p.productcategory = ?1", 
			  nativeQuery = true)
	List<Product> findAllByCategory(String productcategory);

	@Query(value = "select * from Product p where p.producttype = ?1", 
			  nativeQuery = true)
	List<Product> findAllByType(String producttype);

	public Product findByproductid(int productid);
	//public Product findById(int itemid);

	

}
