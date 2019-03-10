package com.example.jetty_jersey.dao;

public interface AirplaneDao {

	Airplane getById(String id);

	boolean addNewPlane(Airplane p);

	boolean editAirplane(Airplane p);

}
