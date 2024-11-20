package org.ironhack.lab_introduccion_jpa.repository;


//import model.Customer;
import org.ironhack.lab_introduccion_jpa.model.Flight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

//Crea repositorios JPA para las clases Flight utilizando la interfaz JpaRepository.

@Repository
public interface FlightRepository extends JpaRepository <Flight, Integer> {
    // queries
    // Buscar vuelos por número de vuelo
    List<Flight> findByFlightNumber(String flightNumber);

    // Buscar vuelos donde el nombre del avión contenga una cadena específica
    List<Flight> findByAircraftContaining(String aircraft);

    // Buscar vuelos cuya distancia (millas) sea mayor a una cantidad dada
    List<Flight> findByFlightMileageGreaterThan(Integer flightMileage);

}
