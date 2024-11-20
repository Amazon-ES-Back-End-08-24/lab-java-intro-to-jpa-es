package org.ironhack.lab_introduccion_jpa.model;
import jakarta.persistence.*;


//Clase Flight
//Crea una clase llamada Flight con las siguientes variables:
//
//flightId (integer): un identificador único generado automáticamente, miembro privado
//flightNumber (string): un identificador de vuelo único (no ID), miembro privado
//aircraft (string): miembro privado
//totalAircraftSeats (integer): miembro privado
//flightMileage (integer): miembro privado
//Agrega un constructor vacío a la clase Flight para que Hibernate pueda crear nuevas instancias de la clase.
//Agrega un constructor parametrizado a la clase Flight que tome flightNumber, aircraft, totalAircraftSeats y flightMileage como parámetros.
//Agrega métodos getter y setter públicos para cada variable en la clase Flight.

import jakarta.persistence.*;

@Entity
@Table(name = "flight")
public class Flight {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer flightId;

    @Column(name = "flight_number")
    private String flightNumber;

    @Column(name = "aircraft")
    private String aircraft;

    @Column(name = "total_aircraft_seats")
    private Integer totalAircraftSeats;

    @Column(name = "flight_mileage")
    private Integer flightMileage;

    // Constructor vacío
    public Flight () {}

    // Constructor parametrizado
    public Flight(Integer flightId, String flightNumber, String aircraft, Integer totalAircraftSeats, Integer flightMileage) {
        this.flightId = flightId;
        this.flightNumber = flightNumber;
        this.aircraft = aircraft;
        this.totalAircraftSeats = totalAircraftSeats;
        this.flightMileage = flightMileage;
    }

    // Getters y Setters
    public Integer getFlightId() {
        return flightId;
    }

    public void setFlightId(Integer flightId) {
        this.flightId = flightId;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getAircraft() {
        return aircraft;
    }

    public void setAircraft(String aircraft) {
        this.aircraft = aircraft;
    }

    public Integer getTotalAircraftSeats() {
        return totalAircraftSeats;
    }

    public void setTotalAircraftSeats(Integer totalAircraftSeats) {
        this.totalAircraftSeats = totalAircraftSeats;
    }

    public Integer getFlightMileage() {
        return flightMileage;
    }

    public void setFlightMileage(Integer flightMileage) {
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
