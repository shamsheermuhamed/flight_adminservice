package com.shamsheer.flightapp.adminservice.Controller;

public class PlaceRequest {
	
	String startplace;
	String endplace;
	
	PlaceRequest(){}
	

	public PlaceRequest(String startplace, String endplace) {
		super();
		this.startplace = startplace;
		this.endplace = endplace;
	}
	public String getStartplace() {
		return startplace;
	}
	public void setStartplace(String startplace) {
		this.startplace = startplace;
	}
	public String getEndplace() {
		return endplace;
	}
	public void setEndplace(String endplace) {
		this.endplace = endplace;
	}
	
}
