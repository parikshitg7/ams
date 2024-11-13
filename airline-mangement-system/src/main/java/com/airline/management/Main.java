package com.airline.management;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // FlightDAO example
        FlightDAO flightDAO = new FlightDAO();
        List<Flight> flights = flightDAO.getAllFlights();
        for (Flight f : flights) {
            System.out.println("Flight: " + f.getFlightName() + " from " + f.getSource() + " to " + f.getDestination());
        }

        // PassengerDAO example
        PassengerDAO passengerDAO = new PassengerDAO();
        List<Passenger> passengers = passengerDAO.getAllPassengers();
        for (Passenger p : passengers) {
            System.out.println("Passenger: " + p.getName());
        }

        // BookingDAO example
        BookingDAO bookingDAO = new BookingDAO();
        List<Booking> bookings = bookingDAO.getAllBookings();
        for (Booking b : bookings) {
            System.out.println("Booking: " + b.getFlightName() + " for " + b.getPassengerName());
        }
    }
}
