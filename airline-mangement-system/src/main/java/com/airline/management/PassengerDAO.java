package com.airline.management;

import java.util.List;
import java.util.ArrayList;

public class PassengerDAO {

    // Dummy method to return list of passengers
    public List<Passenger> getAllPassengers() {
        List<Passenger> passengers = new ArrayList<>();
        // Populate with sample passenger data
        passengers.add(new Passenger(1, "John Doe"));
        passengers.add(new Passenger(2, "Jane Smith"));
        return passengers;
    }
}
