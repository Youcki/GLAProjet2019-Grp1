package com.example.jetty_jersey.dao;

import java.util.Date;
import java.util.List;

public interface FlightDao {

	Flight getById(String id);

	boolean addNewFlight(Flight f);

	boolean modifyFlightData(Flight f);

	List<String> getReservation(String fId);
	boolean editReservation(String fId,List<String> res);
	List<String> getConfirmedSeats(String fId);
	boolean editConfirmedSeats(String fId, List<String> res);

	List<Flight> fliterFlightByDateAndLocation(Aerodrome departure, Date departureDate, Aerodrome arrival, Date arrivalDate);
}
