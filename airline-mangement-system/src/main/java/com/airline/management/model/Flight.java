package com.airline.management.model;

public class Flight {
    private String flightName;
    private String source;
    private String destination;

    public Flight(String flightName, String source, String destination) {
        this.flightName = flightName;
        this.source = source;
        this.destination = destination;
    }

    public String getFlightName() {
        return flightName;
    }

    public String getSource() {
        return source;
    }

    public String getDestination() {
        return destination;
    }
}
