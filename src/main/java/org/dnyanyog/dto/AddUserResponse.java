package org.dnyanyog.dto;

public class AddUserResponse {
	private String responseCode;

	private String message;

	private Integer user_id;

	private AddUserRequest request;

	public String getResponseCode() {
		return responseCode;
	}

	public void setResponseCode(String responseCode) {
		this.responseCode = responseCode;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Integer getUser_id() {
		return user_id;
	}

	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}

	public AddUserRequest getRequest() {
		return request;
	}

	public void setRequest(AddUserRequest request) {
		this.request = request;
	}

}
