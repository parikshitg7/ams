package com.airline.management;

import java.util.List;
import java.util.ArrayList;

public class FlightDAO {

    // Dummy method to return list of flights
    public List<Flight> getAllFlights() {
        List<Flight> flights = new ArrayList<>();
        // Populate with sample flight data
        flights.add(new Flight(1, "Flight 101", "New York", "Los Angeles"));
        flights.add(new Flight(2, "Flight 102", "Boston", "Chicago"));
        return flights;
    }
}
