package com.project2.response;

public class LoginResponse {
	
	String message;
	boolean status;
	public LoginResponse() {
		super();
	}
	public LoginResponse(String message, boolean status) {
		super();
		this.message = message;
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}

}
