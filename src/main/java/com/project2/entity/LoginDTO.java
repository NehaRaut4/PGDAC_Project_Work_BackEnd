package com.project2.entity;

public class LoginDTO {
	private String useremail;
	private String userpassword;
	
	
	public LoginDTO() {
		super();
	}


	public LoginDTO(String useremail, String userpassword) {
		super();
		this.useremail = useremail;
		this.userpassword = userpassword;
	}


	public String getUseremail() {
		return useremail;
	}


	public void setUseremail(String useremail) {
		this.useremail = useremail;
	}


	public String getUserpassword() {
		return userpassword;
	}


	public void setUserpassword(String userpassword) {
		this.userpassword = userpassword;
	}


}
