package com.shamsheer.flightapp.adminservice.Repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.shamsheer.flightapp.adminservice.Entity.Airline;

@Repository
public interface AirlineRepo extends CrudRepository<Airline, String> {

	
}
