package com.example.jetty_jersey.ws;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/user")
public class UserController {

	public static class ExampleClass {
		public String field;
	}

	
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/login")
	public int login(String instance) {
		System.out.println(instance);
		return 1;
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/user/users")
	public ExampleClass getUser(@QueryParam("email") String email) {
		ExampleClass instance = new ExampleClass();
		instance.field = "User "+email;

		return instance;
	}
	
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/user/users")
	public int addPilot(String ex) {
		return 1;
	}
	
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/name")
	public ExampleClass getName(@QueryParam("email") String email) {
		ExampleClass instance = new ExampleClass();
		instance.field = "User "+email+" is called Test";

		return instance;
	}
	
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/name")
	public int editName(@QueryParam("email") String email, String name) {
		System.out.println("User "+email+" is now called "+name);
		return 1;
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/surname")
	public ExampleClass getSurname(@QueryParam("email") String email) {
		ExampleClass instance = new ExampleClass();
		instance.field = "User "+email+" with the surname Test";

		return instance;
	}
	
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/surname")
	public int editSurname(@QueryParam("email") String email, String surname) {
		System.out.println("User "+email+" has now the surname "+surname);
		return 1;
	}
	
	
	
	
	
	
}
