package com.airline.management.dao;

import com.airline.management.model.Passenger;
import java.util.List;
import java.util.ArrayList;

public class PassengerDAO {
    public List<Passenger> getAllPassengers() {
        List<Passenger> passengers = new ArrayList<>();
        passengers.add(new Passenger("John Doe"));
        passengers.add(new Passenger("Jane Smith"));
        return passengers;
    }
}
