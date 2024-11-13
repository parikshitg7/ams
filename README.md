# Airline Management System

This is a Java-based Airline Management System, which allows users to manage flights, passengers, and bookings. The project is built using **Maven** for dependency management and **MySQL** as the database.

## Features

- **Flight Management**: Add, update, and display flight details.
- **Passenger Management**: Add, update, and display passenger information.
- **Booking Management**: Create and manage bookings, linking passengers to flights.

## Technologies Used

- **Java 21.0.2**
- **Maven** for dependency management
- **MySQL** for database management
- **JDBC** for database connectivity
- **DAO Pattern** for database operations

## Project Structure


- **`dao/`**: Contains Data Access Object (DAO) classes that interact with the database.
- **`model/`**: Contains the model classes representing entities (Flight, Passenger, Booking).
- **`Main.java`**: The entry point of the application which demonstrates the functionality.

## Prerequisites

Before running the project, ensure you have the following installed:

- **JDK 21.0.2** (or higher)
- **Maven**
- **MySQL Server**

### MySQL Database Setup

1. **Create the Database:**
   ```sql
   CREATE DATABASE airline_management;
CREATE TABLE flights (
    flight_id INT PRIMARY KEY AUTO_INCREMENT,
    flight_number VARCHAR(10) NOT NULL,
    destination VARCHAR(100)
);

CREATE TABLE passengers (
    passenger_id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100) NOT NULL,
    email VARCHAR(100)
);

CREATE TABLE bookings (
    booking_id INT PRIMARY KEY AUTO_INCREMENT,
    flight_id INT,
    passenger_id INT,
    booking_date DATE,
    FOREIGN KEY (flight_id) REFERENCES flights(flight_id),
    FOREIGN KEY (passenger_id) REFERENCES passengers(passenger_id)
);

  
