package org.amazon.lab_3_04.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Flight {


// (integer): un identificador único generado automáticamente, miembro privado
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int flightId;
    private String flightNumber;
    private String aircraft;
    private int totalAircraftSeats;
    private int flightMileage;

    public Flight() {
    }

    public Flight(String flightNumber, String aircraft, int totalAircraftSeats, int flightMileage) {
        this.flightNumber = flightNumber;
        this.aircraft = aircraft;
        this.totalAircraftSeats = totalAircraftSeats;
        this.flightMileage = flightMileage;
    }

    public int getFlightId() {
        return flightId;
    }
    public String getFlightNumber() {
        return flightNumber;
    }
    public String getAircraft() {
        return aircraft;
    }
    public int getTotalAircraftSeats() {
        return totalAircraftSeats;
    }
    public int getFlightMileage() {
        return flightMileage;
    }
    public void setFlightId(int flightId) {
        this.flightId = flightId;
    }
    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }
    public void setAircraft(String aircraft) {
        this.aircraft = aircraft;
    }
    public void setTotalAircraftSeats(int totalAircraftSeats) {
        this.totalAircraftSeats = totalAircraftSeats;
    }
    public void setFlightMileage(int flightMileage) {
        this.flightMileage = flightMileage;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "flightId=" + flightId +
                ", flightNumber='" + flightNumber + '\'' +
                ", aircraft='" + aircraft + '\'' +
                ", totalAircraftSeats=" + totalAircraftSeats +
                ", flightMileage=" + flightMileage +
                '}';
    }
}
