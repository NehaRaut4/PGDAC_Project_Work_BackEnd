package com.project2.entity;

public class UserDTO {
	private int userid;
	private String useremail;
	private String userpassword;
	private String userrole;
	public UserDTO() {
		super();
	}
	public UserDTO(int userid, String useremail, String userpassword, String userrole) {
		super();
		this.userid = userid;
		this.useremail = useremail;
		this.userpassword = userpassword;
		this.userrole = userrole;
	}
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
	public String getUserrole() {
		return userrole;
	}
	public void setUserrole(String userrole) {
		this.userrole = userrole;
	}
	
}
