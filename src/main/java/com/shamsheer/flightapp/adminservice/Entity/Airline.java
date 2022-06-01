package com.shamsheer.flightapp.adminservice.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Airline {

 @Id
 private String airname;
 private Long airphone;
 private String airaddress;
 
 public Airline()
 {
	 
 }
public Airline(String airname, Long airphone, String airaddress) {
	super();
	this.airname = airname;
	this.airphone = airphone;
	this.airaddress = airaddress;
}
public String getAirname() {
	return airname;
}
public void setAirname(String airname) {
	this.airname = airname;
}


public Long getAirphone() {
	return airphone;
}
public void setAirphone(Long airphone) {
	this.airphone = airphone;
}
public String getAiraddress() {
	return airaddress;
}
public void setAiraddress(String airaddress) {
	this.airaddress = airaddress;
}

 
 
}
