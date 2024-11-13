package com.airline.management;

public class Booking {
    private int id;
    private String flightName;
    private String passengerName;

    public Booking(int id, String flightName, String passengerName) {
        this.id = id;
        this.flightName = flightName;
        this.passengerName = passengerName;
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

    public String getPassengerName() {
        return passengerName;
    }

    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }
}
