package com.carlos.lab3._4;
import org.springframework.data.jpa.repository.JpaRepository;

public class FlightBooking {
    private Integer bookingId; // Hibernate lo generará automáticamente
    private Integer customerId;
    private Integer flightId;

    public FlightBooking() {}

    public FlightBooking(Integer customerId, Integer flightId) {
        this.customerId = customerId;
        this.flightId = flightId;
    }

    public Integer getBookingId() {
        return bookingId;
    }

    public void setBookingId(Integer bookingId) {
        this.bookingId = bookingId;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public Integer getFlightId() {
        return flightId;
    }

    public void setFlightId(Integer flightId) {
        this.flightId = flightId;
    }
}
