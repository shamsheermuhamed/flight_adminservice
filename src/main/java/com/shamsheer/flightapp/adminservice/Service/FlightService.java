package com.shamsheer.flightapp.adminservice.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shamsheer.flightapp.adminservice.Controller.PlaceRequest;
import com.shamsheer.flightapp.adminservice.Entity.Flight;
import com.shamsheer.flightapp.adminservice.Repo.FlightRepository;



@Service
public class FlightService {
	
	@Autowired
	FlightRepository repo;
	
	public Iterable<Flight> getAllFlights()
	{
		return repo.findAll();
	}
	
	public Optional<Flight> getFlightsbyId(Integer flightid) {
		// TODO Auto-generated method stub
		return repo.findById(flightid);
	}
	
	
//	 public Iterable<Flight> getAllFlightbyDate(Flight theflight)
//	 {
//		return repo.findAllByDate(theflight.getStarttime(),theflight.getEndtime());
//	 }
	 
	 public Iterable<Flight> getAllFlightbyPlace(PlaceRequest theflight)
	 {
		return repo.findAllByPlace(theflight.getStartplace(),theflight.getEndplace());
	 }

	 
	 public void addNewFlight(Flight newFlight)
	 {
		 repo.save(newFlight);
	 }
	 
	public void updateFlight(Flight updateFlight) {
		repo.save(updateFlight);
		
	}


	public void deleteFlightById(Integer id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
	}
}
