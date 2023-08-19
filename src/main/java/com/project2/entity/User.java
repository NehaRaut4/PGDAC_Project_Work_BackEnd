package com.project2.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.DynamicUpdate;

@Entity
@DynamicUpdate
public class User {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userid;
	private String useremail;
	private String userpassword;
	private String userrole;
	public User() {
		super();
	}
	public User(int userid, String useremail, String userpassword, String userrole) {
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
