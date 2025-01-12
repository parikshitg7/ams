package com.airline.management.dao;

import com.airline.management.model.Flight;
import java.util.List;
import java.util.ArrayList;

public class FlightDAO {
    public List<Flight> getAllFlights() {
        List<Flight> flights = new ArrayList<>();
        flights.add(new Flight("Flight101", "New York", "Los Angeles"));
        flights.add(new Flight("Flight202", "Chicago", "Miami"));
        return flights;
    }
}
