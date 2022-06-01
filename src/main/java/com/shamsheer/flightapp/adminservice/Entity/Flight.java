package com.shamsheer.flightapp.adminservice.Entity;

import java.time.LocalTime;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;


@Entity
public class Flight {
	
	@Id
	private Integer flightid;
	private String flightfrom;
	private String flightto;
	private LocalTime starttime;
	private LocalTime endtime;
	private Integer seats;
	private Double price;
	private Boolean status;
	
	@ManyToOne
	private Airline airline;
	
	public Flight() {}

	public Flight(Integer flightid, String flightfrom, String flightto, LocalTime starttime, LocalTime endtime,
			Integer seats, Double price, Boolean status, Airline airline) {
		super();
		this.flightid = flightid;
		this.flightfrom = flightfrom;
		this.flightto = flightto;
		this.starttime = starttime;
		this.endtime = endtime;
		this.seats = seats;
		this.price = price;
		this.status = status;
		this.airline = airline;
	}

	public Integer getFlightid() {
		return flightid;
	}

	public void setFlightid(Integer flightid) {
		this.flightid = flightid;
	}

	public String getFlightfrom() {
		return flightfrom;
	}

	public void setFlightfrom(String flightfrom) {
		this.flightfrom = flightfrom;
	}

	public String getFlightto() {
		return flightto;
	}

	public void setFlightto(String flightto) {
		this.flightto = flightto;
	}

	public LocalTime getStarttime() {
		return starttime;
	}

	public void setStarttime(LocalTime starttime) {
		this.starttime = starttime;
	}

	public LocalTime getEndtime() {
		return endtime;
	}

	public void setEndtime(LocalTime endtime) {
		this.endtime = endtime;
	}

	public Integer getSeats() {
		return seats;
	}

	public void setSeats(Integer seats) {
		this.seats = seats;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public Airline getAirline() {
		return airline;
	}

	public void setAirline(String airlinename) {
		this.airline = new Airline(airlinename,(long) 0,"");
	}

	
	
}
