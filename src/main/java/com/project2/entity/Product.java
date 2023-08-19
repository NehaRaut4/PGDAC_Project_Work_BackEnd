package com.project2.entity;

import java.util.Date;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity

public class Product {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int productid;
	private String productname;
	private float producttenureoneprice;  
	private float producttenuretwoprice;  
	private float producttenurethreeprice;  
	private int productdiscountone;  
	private int productdiscounttwo;  
	private int productdiscountthree;  
	private String productcategory; 
	private String productsubcategory;  
	private String productreturnpolicy;  
	private int productquantity;  
	private String productmadein; 
	private String productdescription;
	private String productdimensions; 
	private int productdeposit; 
	
	@Lob
	private byte[] productpicture;

	public Product() {
		super();
	}

	public int getProductid() {
		return productid;
	}

	public void setProductid(int productid) {
		this.productid = productid;
	}

	public String getProductname() {
		return productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}

	public float getProducttenureoneprice() {
		return producttenureoneprice;
	}

	public void setProducttenureoneprice(float producttenureoneprice) {
		this.producttenureoneprice = producttenureoneprice;
	}

	public float getProducttenuretwoprice() {
		return producttenuretwoprice;
	}

	public void setProducttenuretwoprice(float producttenuretwoprice) {
		this.producttenuretwoprice = producttenuretwoprice;
	}

	public float getProducttenurethreeprice() {
		return producttenurethreeprice;
	}

	public void setProducttenurethreeprice(float producttenurethreeprice) {
		this.producttenurethreeprice = producttenurethreeprice;
	}

	public int getProductdiscountone() {
		return productdiscountone;
	}

	public void setProductdiscountone(int productdiscountone) {
		this.productdiscountone = productdiscountone;
	}

	public int getProductdiscounttwo() {
		return productdiscounttwo;
	}

	public void setProductdiscounttwo(int productdiscounttwo) {
		this.productdiscounttwo = productdiscounttwo;
	}

	public int getProductdiscountthree() {
		return productdiscountthree;
	}

	public void setProductdiscountthree(int productdiscountthree) {
		this.productdiscountthree = productdiscountthree;
	}

	public String getProductcategory() {
		return productcategory;
	}

	public void setProductcategory(String productcategory) {
		this.productcategory = productcategory;
	}

	public String getProductsubcategory() {
		return productsubcategory;
	}

	public void setProductsubcategory(String productsubcategory) {
		this.productsubcategory = productsubcategory;
	}

	public String getProductreturnpolicy() {
		return productreturnpolicy;
	}

	public void setProductreturnpolicy(String productreturnpolicy) {
		this.productreturnpolicy = productreturnpolicy;
	}

	public int getProductquantity() {
		return productquantity;
	}

	public void setProductquantity(int productquantity) {
		this.productquantity = productquantity;
	}

	public String getProductmadein() {
		return productmadein;
	}

	public void setProductmadein(String productmadein) {
		this.productmadein = productmadein;
	}

	public String getProductdescription() {
		return productdescription;
	}

	public void setProductdescription(String productdescription) {
		this.productdescription = productdescription;
	}

	public String getProductdimensions() {
		return productdimensions;
	}

	public void setProductdimensions(String productdimensions) {
		this.productdimensions = productdimensions;
	}

	public int getProductdeposit() {
		return productdeposit;
	}

	public void setProductdeposit(int productdeposit) {
		this.productdeposit = productdeposit;
	}

	public byte[] getProductpicture() {
		return productpicture;
	}

	public void setProductpicture(byte[] productpicture) {
		this.productpicture = productpicture;
	}
	
	

}
