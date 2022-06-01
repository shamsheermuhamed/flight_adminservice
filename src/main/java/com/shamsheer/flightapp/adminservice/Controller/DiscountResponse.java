package com.shamsheer.flightapp.adminservice.Controller;

public class DiscountResponse {
	
	String message;
	Double amount;
	public DiscountResponse(String message, Double amount) {
		super();
		this.message = message;
		this.amount = amount;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	
}
