package com.car.insurance.web.domains;

import java.io.Serializable;

public class ResponseData implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4463606132668433391L;
	
	private String responseCode;
	
	private String responseMessage;

	public String getResponseCode() {
		return responseCode;
	}

	public void setResponseCode(String responseCode) {
		this.responseCode = responseCode;
	}

	public String getResponseMessage() {
		return responseMessage;
	}

	public void setResponseMessage(String responseMessage) {
		this.responseMessage = responseMessage;
	}
	
	

}
