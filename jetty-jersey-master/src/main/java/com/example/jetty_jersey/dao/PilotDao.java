package com.example.jetty_jersey.dao;

public interface PilotDao {

	Pilot getById(String mail);

	boolean addNewPilot(Pilot p);

	boolean editPilotData(Pilot p);


}
