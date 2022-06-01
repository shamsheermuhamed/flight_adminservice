package com.shamsheer.flightapp.adminservice.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shamsheer.flightapp.adminservice.Entity.Airline;
import com.shamsheer.flightapp.adminservice.Entity.Flight;
import com.shamsheer.flightapp.adminservice.Service.FlightService;


@CrossOrigin
@RestController
@RequestMapping("/flight")
public class FlightController {
	
	@Autowired
	FlightService service;
	
	@GetMapping(value="/flights")
	Iterable<Flight> getAllFlightDetails()
	{
		service.getAllFlights().iterator().forEachRemaining(x->
		System.out.println(x.getAirline().getAiraddress()));
		
		return service.getAllFlights();
	}
	
	
	
	@GetMapping(value="/flight/{flightid}")
	Optional<Flight> getAllFlightsbyId(@PathVariable Integer flightid)
	{
		return service.getFlightsbyId(flightid);
	}
	
	
	@PostMapping(value="/flight/getFlightsbyPlace")
	Iterable<Flight> getAllFlightsbyPlace(@RequestBody PlaceRequest theflight)
	{
		System.out.println(theflight.getStartplace());
		return service.getAllFlightbyPlace(theflight);
	}
	

                //ADDING AND UPDATING FLIGHTS
	
	@PostMapping(value="/flight/add")
	String addNewFlight(@RequestBody Flight newFlight)
	{
		
		service.addNewFlight(newFlight);
		return "Successfully added";
	}
	
	@PostMapping(value="/flight/update")
	String updateFlightDetails(@RequestBody Flight updateFlight)
	{
		service.updateFlight(updateFlight);
		return "Successfully updated";
	}
	@DeleteMapping(value="/flight/delete/{id}")
	void deleteFlightById(@PathVariable Integer id)
	{
		service.deleteFlightById(id);
	}
}
