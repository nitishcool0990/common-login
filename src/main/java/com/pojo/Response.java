package com.pojo;

public enum Response {
	SUCCESS("200", "SUCCESS"),
	UNAUTHORIZED_ACCESS("401", "UNAUTHORIZED ACCESS"),
	SERVER_INTERNAL_ERROR("500", "SERVER INTERNAL ERROR");

	private String code;
	private String message;

	Response(String code, String message) {
		this.code = code;
		this.message = message;
	}

	public String getCode() {
		return code;
	}

	public String getMessage() {
		return message;
	}
	
	
}
