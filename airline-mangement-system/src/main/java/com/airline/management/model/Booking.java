package com.airline.management.model;

public class Booking {
    private String flightName;
    private String passengerName;

    public Booking(String flightName, String passengerName) {
        this.flightName = flightName;
        this.passengerName = passengerName;
    }

    public String getFlightName() {
        return flightName;
    }

    public String getPassengerName() {
        return passengerName;
    }
}
