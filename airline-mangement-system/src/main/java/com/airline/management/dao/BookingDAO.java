package com.airline.management.dao;

import com.airline.management.model.Booking;
import java.util.List;
import java.util.ArrayList;

public class BookingDAO {
    public List<Booking> getAllBookings() {
        List<Booking> bookings = new ArrayList<>();
        bookings.add(new Booking("Flight101", "John Doe"));
        bookings.add(new Booking("Flight202", "Jane Smith"));
        return bookings;
    }
}
