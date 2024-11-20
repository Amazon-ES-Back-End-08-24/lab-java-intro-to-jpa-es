package org.ironhack.lab_introduccion_jpa;

import org.ironhack.lab_introduccion_jpa.model.Customer;
import org.ironhack.lab_introduccion_jpa.model.CustomerStatus;
import org.ironhack.lab_introduccion_jpa.model.Flight;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.ironhack.lab_introduccion_jpa.repository.CustomerRepository;
import org.ironhack.lab_introduccion_jpa.repository.FlightRepository;
import java.util.List;

@Component
public class DataLoaderCommandLineRunner implements CommandLineRunner {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private CustomerRepository flightRepository;

    @Autowired
    private FlightRepository flightBookingRepository;


    @Override
    public void run(String... args) throws Exception {
        // 1. Crear nuevos clientes
        Customer customer1 = new Customer("Pepito", CustomerStatus.GOLD, 12000);
        Customer customer2 = new Customer("Juanito", CustomerStatus.SILVER, 8000);
        Customer customer3 = new Customer("Pablito", CustomerStatus.None, 3289);

        customerRepository.save(customer1);
        customerRepository.save(customer2);
        customerRepository.save(customer3);

        // 2. Crear nuevos vuelos
        Flight flight1 = new Flight(123, "Boeing 737", "180", 1500, 2450);
        Flight flight2 = new Flight(234, "Airbus A320", "150", 600, 861);
        Flight flight3 = new Flight(345, "Boeing 777", "300", 2000, 4337);

        flightBookingRepository.save(flight1);
        flightBookingRepository.save(flight2);
        flightBookingRepository.save(flight3);

        // 3. Buscar todos los clientes
        List<Customer> allCustomers = customerRepository.findAll();
        System.out.println("Todos los clientes: " + allCustomers);

        // 4. Buscar todos los vuelos
        List<Customer> allFlights = flightRepository.findAll();
        System.out.println("Todos los vuelos: " + allFlights);

        // 5. Buscar clientes por nombre
        List<Customer> customersByName = customerRepository.findByCustomerName("Alice");
        System.out.println("Clientes con el nombre Alice: " + customersByName);

        // 6. Buscar clientes por estatus
        List<Customer> goldCustomers = customerRepository.findByCustomerStatus(CustomerStatus.GOLD);
        System.out.println("Clientes con estatus Gold: " + goldCustomers);

//         7. Buscar vuelos por número de vuelo
        List<Flight> flightByNumber = flightBookingRepository.findByFlightNumber("AA123");
        System.out.println("Vuelos con número AA123: " + flightByNumber);

        // 8. Buscar aviones cuyo nombre contenga "Boeing"
        List<Flight> boeingFlights = flightBookingRepository.findByAircraftContaining("Boeing");
        System.out.println("Vuelos con aviones que contienen 'Boeing': " + boeingFlights);

        // 9. Buscar vuelos con una distancia mayor a 500 millas
        List<Flight> longDistanceFlights = flightBookingRepository.findByFlightMileageGreaterThan(500);
        System.out.println("Vuelos con más de 500 millas: " + longDistanceFlights);


    }
}