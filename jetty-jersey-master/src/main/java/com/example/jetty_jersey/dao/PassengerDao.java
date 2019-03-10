package com.example.jetty_jersey.dao;

public interface PassengerDao {

	Passenger getById(String id);

	boolean addNewPassenger(Passenger p);

	boolean editPassengerData(Passenger p);

}
