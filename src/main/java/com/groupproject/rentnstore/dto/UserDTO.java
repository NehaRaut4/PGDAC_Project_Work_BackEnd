package com.groupproject.rentnstore.dto;

public class UserDTO {
	
	private int userid;
	private String useremail;
	private String userpassword;
	private String userphone;
	private String useraddress;
	private String usercity;
	public UserDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserDTO(int userid, String useremail, String userpassword, String userphone, String useraddress,
			String usercity) {
		super();
		this.userid = userid;
		this.useremail = useremail;
		this.userpassword = userpassword;
		this.userphone = userphone;
		this.useraddress = useraddress;
		this.usercity = usercity;
	}
	public UserDTO(String useremail, String userpassword, String userphone, String useraddress, String usercity) {
		super();
		this.useremail = useremail;
		this.userpassword = userpassword;
		this.userphone = userphone;
		this.useraddress = useraddress;
		this.usercity = usercity;
	}
	//
	
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
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
	public String getUserphone() {
		return userphone;
	}
	public void setUserphone(String userphone) {
		this.userphone = userphone;
	}
	public String getUseraddress() {
		return useraddress;
	}
	public void setUseraddress(String useraddress) {
		this.useraddress = useraddress;
	}
	public String getUsercity() {
		return usercity;
	}
	public void setUsercity(String usercity) {
		this.usercity = usercity;
	}

}
