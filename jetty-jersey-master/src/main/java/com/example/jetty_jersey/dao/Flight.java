package com.example.jetty_jersey.dao;

import java.util.Date;
import java.util.List;

public class Flight {

	public Aerodrome departure, arrival;
	public Date departureDate, arrivalDate;
	public GpsPosition rdvPoint;

	public int avaliableSeats;
	public int fare;
	public Airplane airplane;

}
