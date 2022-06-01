package com.shamsheer.flightapp.adminservice.Repo;

import java.util.Date;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.shamsheer.flightapp.adminservice.Entity.Flight;



@Repository
public interface FlightRepository extends CrudRepository<Flight, Integer>{


//	Iterable<Flight> findAllByPlace(String place);
	
	@Query(value="select t from Flight t where t.starttime>=?1 and t.endtime<=?2 and t.status=true" )
	Iterable<Flight> findAllByDate(@Param("starttime") Date a,@Param("endtime") Date b);

	@Query(value="select t from Flight t where t.flightfrom=?1 and t.flightto=?2" )
	Iterable<Flight> findAllByPlace(String flightfrom, String flightto);

//	and t.status=true"

	

}
