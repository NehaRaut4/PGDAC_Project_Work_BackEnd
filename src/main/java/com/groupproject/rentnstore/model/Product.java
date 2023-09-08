package com.groupproject.rentnstore.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity

public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int productid;
	private String productname;
	private double productprice;
	private int productdiscount;
	private String productdesc;
	private String productcategory;
	private String producttype;
	private String productdim;
	private String productreturnp;
	private int productquantity;
	private int productdeposit;
	private boolean isstock;
	
	@Lob
	private byte[] productimage;

	//Relationship with table CartItem
	@OneToOne(mappedBy = "product")
	private CartItem cartitem;
	
	/*
	 * @OneToOne(mappedBy = "product") private OrderItem orderitem;
	 */
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public Product(int productid, String productname, double productprice, int productdiscount, String productdesc,
			String productcategory, String producttype, String productdim, String productreturnp, int productquantity,
			int productdeposit, byte[] productimage) {
		super();
		this.productid = productid;
		this.productname = productname;
		this.productprice = productprice;
		this.productdiscount = productdiscount;
		this.productdesc = productdesc;
		this.productcategory = productcategory;
		this.producttype = producttype;
		this.productdim = productdim;
		this.productreturnp = productreturnp;
		this.productquantity = productquantity;
		this.productdeposit = productdeposit;
		this.productimage = productimage;
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

	public double getProductprice() {
		return productprice;
	}

	public void setProductprice(double productprice) {
		this.productprice = productprice;
	}

	public int getProductdiscount() {
		return productdiscount;
	}

	public void setProductdiscount(int productdiscount) {
		this.productdiscount = productdiscount;
	}

	public String getProductdesc() {
		return productdesc;
	}

	public void setProductdesc(String productdesc) {
		this.productdesc = productdesc;
	}

	public String getProductcategory() {
		return productcategory;
	}

	public void setProductcategory(String productcategory) {
		this.productcategory = productcategory;
	}

	public String getProducttype() {
		return producttype;
	}

	public void setProducttype(String producttype) {
		this.producttype = producttype;
	}

	public String getProductdim() {
		return productdim;
	}

	public void setProductdim(String productdim) {
		this.productdim = productdim;
	}

	public String getProductreturnp() {
		return productreturnp;
	}

	public void setProductreturnp(String productreturnp) {
		this.productreturnp = productreturnp;
	}

	public int getProductquantity() {
		return productquantity;
	}

	public void setProductquantity(int productquantity) {
		this.productquantity = productquantity;
	}

	public int getProductdeposit() {
		return productdeposit;
	}

	public void setProductdeposit(int productdeposit) {
		this.productdeposit = productdeposit;
	}

	public byte[] getProductimage() {
		return productimage;
	}

	public void setProductimage(byte[] productimage) {
		this.productimage = productimage;
	}



	public CartItem getCartitem() {
		return cartitem;
	}



	public void setCartitem(CartItem cartitem) {
		this.cartitem = cartitem;
	}



	public Product(int productid, String productname, double productprice, int productdiscount, String productdesc,
			String productcategory, String producttype, String productdim, String productreturnp, int productquantity,
			int productdeposit, byte[] productimage, CartItem cartitem) {
		super();
		this.productid = productid;
		this.productname = productname;
		this.productprice = productprice;
		this.productdiscount = productdiscount;
		this.productdesc = productdesc;
		this.productcategory = productcategory;
		this.producttype = producttype;
		this.productdim = productdim;
		this.productreturnp = productreturnp;
		this.productquantity = productquantity;
		this.productdeposit = productdeposit;
		this.productimage = productimage;
		this.cartitem = cartitem;
	}



	public Product(int productid, String productname, double productprice, int productdiscount, String productdesc,
			String productcategory, String producttype, String productdim, String productreturnp, int productquantity,
			int productdeposit, boolean isstock, byte[] productimage, CartItem cartitem) {
		super();
		this.productid = productid;
		this.productname = productname;
		this.productprice = productprice;
		this.productdiscount = productdiscount;
		this.productdesc = productdesc;
		this.productcategory = productcategory;
		this.producttype = producttype;
		this.productdim = productdim;
		this.productreturnp = productreturnp;
		this.productquantity = productquantity;
		this.productdeposit = productdeposit;
		this.isstock = isstock;
		this.productimage = productimage;
		this.cartitem = cartitem;
	}



	public boolean isIsstock() {
		return isstock;
	}



	public void setIsstock(boolean isstock) {
		this.isstock = isstock;
	}



	/*
	 * public Product(int productid, String productname, double productprice, int
	 * productdiscount, String productdesc, String productcategory, String
	 * producttype, String productdim, String productreturnp, int productquantity,
	 * int productdeposit, boolean isstock, byte[] productimage, CartItem cartitem,
	 * OrderItem orderitem) { super(); this.productid = productid; this.productname
	 * = productname; this.productprice = productprice; this.productdiscount =
	 * productdiscount; this.productdesc = productdesc; this.productcategory =
	 * productcategory; this.producttype = producttype; this.productdim =
	 * productdim; this.productreturnp = productreturnp; this.productquantity =
	 * productquantity; this.productdeposit = productdeposit; this.isstock =
	 * isstock; this.productimage = productimage; this.cartitem = cartitem;
	 * this.orderitem = orderitem; }
	 */

	
	


	
	
	
}
