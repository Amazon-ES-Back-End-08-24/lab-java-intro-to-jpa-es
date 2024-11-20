package org.ironhack.lab_introduccion_jpa.repository;
import org.ironhack.lab_introduccion_jpa.model.FlightBooking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//Crea repositorios JPA para las clases FlightBooking utilizando la interfaz JpaRepository.

@Repository
public interface FlightBookingRepository extends JpaRepository <FlightBooking, Integer> {
    //queries

}
