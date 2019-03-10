package com.example.jetty_jersey.ws;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/plane")
public class PlaneController {

	public static class ExampleClass {
		public String field;
	}


	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/planes")
	public ExampleClass getPlane(@QueryParam("id") int id) {
		ExampleClass instance = new ExampleClass();
		instance.field = "Plane "+id;

		return instance;
	}
	
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/planes")
	public int addPlane(String ex) {
		return 1;
	}
	
	
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/planes")
	public int editPlaneInformation(@QueryParam("id") int id, String information) {
		System.out.println("Plane "+id+" has now the information "+information);
		return 1;
	}
	
	
}
