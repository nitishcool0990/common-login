package com.pojo;

public class LoginResponse {
	
	private String userName;
	private String token;
	private int userId;
	
	public LoginResponse(String userName, String token, int userId) {
		super();
		this.userName = userName;
		this.token = token;
		this.userId = userId;
	}
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	
		

}
