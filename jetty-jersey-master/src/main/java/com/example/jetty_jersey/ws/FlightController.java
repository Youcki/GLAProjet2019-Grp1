package com.example.jetty_jersey.ws;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/flight")
public class FlightController {

	public static class ExampleClass {
		public String field;
	}

	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/flights")
	public ExampleClass getFlight(@QueryParam("flight_id") int flight_id) {
		ExampleClass instance = new ExampleClass();
		instance.field = "Flight "+flight_id;

		return instance;
	}
	
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/flights")
	public int addPilot(String ex) {
		return 1;
	}
	
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/depaero")
	public ExampleClass getDepartureAero(@QueryParam("flight_id") int flight_id) {
		ExampleClass instance = new ExampleClass();
		instance.field = "Departure aero of "+flight_id+" is called Test";

		return instance;
	}
	
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/depaero")
	public int editDepartureAero(@QueryParam("flight_id") int flight_id, String name) {
		System.out.println("The new Departure aero "+flight_id+" is now called "+name);
		return 1;
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/arraero")
	public ExampleClass getArrivalAero(@QueryParam("flight_id") int flight_id) {
		ExampleClass instance = new ExampleClass();
		instance.field = "Arrival aero of "+flight_id+" is called Test";

		return instance;
	}
	
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/arraero")
	public int editArrivalAero(@QueryParam("flight_id") int flight_id, String name) {
		System.out.println("The new arrival aero "+flight_id+" is now called "+name);
		return 1;
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/duration")
	public ExampleClass getDuration(@QueryParam("flight_id") int flight_id) {
		ExampleClass instance = new ExampleClass();
		instance.field = "The flight "+flight_id+" lasts Test";

		return instance;
	}
	
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/duration")
	public int editDuration(@QueryParam("flight_id") int flight_id, int duration) {
		System.out.println("The flight "+flight_id+" now lasts "+duration);
		return 1;
	}
	
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/availableseats")
	public ExampleClass getAvailableSeats(@QueryParam("flight_id") int flight_id) {
		ExampleClass instance = new ExampleClass();
		instance.field = "The flight "+flight_id+" has Test available seats";

		return instance;
	}
	
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/availableseats")
	public int editAvailableSeats(@QueryParam("flight_id") int flight_id, int available) {
		System.out.println("The flight "+flight_id+" has now "+available+" available seats");
		return 1;
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/confirmedseats")
	public ExampleClass getCOnfirmedSeats(@QueryParam("flight_id") int flight_id) {
		ExampleClass instance = new ExampleClass();
		instance.field = "The flight "+flight_id+" has Test confirmed seats";

		return instance;
	}
	
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/confirmedseats")
	public int editConfirmedSeats(@QueryParam("flight_id") int flight_id, int confirmed) {
		System.out.println("The flight "+flight_id+" has now "+confirmed+" confirmed seats");
		return 1;
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/fare")
	public ExampleClass getFare(@QueryParam("flight_id") int flight_id) {
		ExampleClass instance = new ExampleClass();
		instance.field = "The fare of the flight "+flight_id+" is Test";

		return instance;
	}
	
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/fare")
	public int editFare(@QueryParam("flight_id") int flight_id, int fare) {
		System.out.println("The fare of the flight "+flight_id+" is now "+fare);
		return 1;
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/rdvpoint")
	public ExampleClass getRDVPoint(@QueryParam("flight_id") int flight_id) {
		ExampleClass instance = new ExampleClass();
		instance.field = "The rdv point of the flight "+flight_id+" is Test";

		return instance;
	}
	
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/rdvpoint")
	public int editRDVPoint(@QueryParam("flight_id") int flight_id, String rdvPoint) {
		System.out.println("The rdv point of the flight "+flight_id+" is now : "+rdvPoint);
		return 1;
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/plane")
	public ExampleClass getPlane(@QueryParam("flight_id") int flight_id) {
		ExampleClass instance = new ExampleClass();
		instance.field = "The plane of the flight "+flight_id+" is Test";

		return instance;
	}
	
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/plane")
	public int editPlane(@QueryParam("flight_id") int flight_id, String plane) {
		System.out.println("The plane of the flight "+flight_id+" is now : "+plane);
		return 1;
	}
	
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/reservation")
	public ExampleClass getReservations(@QueryParam("flight_id") int flight_id) {
		ExampleClass instance = new ExampleClass();
		instance.field = "The reservations for the flight "+flight_id+" are Test";

		return instance;
	}
	
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("/reservation")
	public int editReservations(@QueryParam("flight_id") int flight_id, String reservations) {
		System.out.println("The reservation for the flight "+flight_id+" are now : "+reservations);
		return 1;
	}
	
	

	/*
	 * This function allows to search for a flight by a departure and arrival aerodrome and by departure and arrival date
	 */
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/flightbyinfo")
	public ExampleClass getAllFlights(@QueryParam("aer_dep") String aer_dep, @QueryParam("aer_arr") String aer_arr, @QueryParam("date_dep") String date_dep, @QueryParam("date_arr") String date_arr) {
		ExampleClass instance = new ExampleClass();
		instance.field = "vol partant de "+aer_dep+" à "+date_dep+" et arrivant à "+aer_arr+" à "+date_arr;

		return instance;
	}
	
	
	
	
	
}
