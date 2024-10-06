package org.amazon.lab_3_04.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class FlightBooking {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int bookingId;
    private int customerId;
    private int flightId;

    public FlightBooking() {
    }
    public FlightBooking(int customerId, int flightId) {
        this.customerId = customerId;
        this.flightId = flightId;
    }
    public int getBookingId() {
        return bookingId;
    }
    public int getCustomerId() {
        return customerId;
    }
    public int getFlightId() {
        return flightId;
    }
    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }
    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }
    public void setFlightId(int flightId) {
        this.flightId = flightId;
    }
    //Agrega métodos getter y setter públicos para cada variable en la clase FlightBooking.

}
