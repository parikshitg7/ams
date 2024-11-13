package com.airline.management;

import java.util.List;
import java.util.ArrayList;

public class BookingDAO {

    // Dummy method to return list of bookings
    public List<Booking> getAllBookings() {
        List<Booking> bookings = new ArrayList<>();
        // Populate with sample booking data
        bookings.add(new Booking(1, "Flight 101", "John Doe"));
        bookings.add(new Booking(2, "Flight 102", "Jane Smith"));
        return bookings;
    }
}
