package com.airline.management;

public class Flight {
    private int id;
    private String flightName;
    private String source;
    private String destination;

    public Flight(int id, String flightName, String source, String destination) {
        this.id = id;
        this.flightName = flightName;
        this.source = source;
        this.destination = destination;
    }

    // Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFlightName() {
        return flightName;
    }

    public void setFlightName(String flightName) {
        this.flightName = flightName;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }
}
