package org.ironhack.lab_introduccion_jpa.model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.boot.CommandLineRunner;
//Crea una clase llamada FlightBooking con las siguientes variables:
//
//bookingId (integer): un identificador único generado automáticamente, miembro privado
//customerId (integer): miembro privado
//flightId (integer): miembro privado
//Agrega un constructor vacío a la clase FlightBooking para que Hibernate pueda crear nuevas instancias de la clase.
//Agrega un constructor parametrizado a la clase FlightBooking que tome customerId y flightId como parámetros.
//Agrega métodos getter y setter públicos para cada variable en la clase FlightBooking.

import jakarta.persistence.*;

@Entity
//@Table(name = "booking_table")
public class FlightBooking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer bookingId;

    @Column(name = "customer_id")
    private Integer customerId;

    @Column(name = "flight_id")
    private Integer flightId;

    // Constructor vacío
    public FlightBooking() {}

    // Constructor parametrizado

    public FlightBooking(Integer bookingId, Integer customerId, Integer flightId) {
        this.bookingId = bookingId;
        this.customerId = customerId;
        this.flightId = flightId;
    }

    // Getters y Setters
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
