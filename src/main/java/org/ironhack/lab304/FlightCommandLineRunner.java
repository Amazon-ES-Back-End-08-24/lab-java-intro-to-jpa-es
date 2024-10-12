package org.ironhack.lab304;

import org.ironhack.lab304.Enum.CustomerStatus;
import org.ironhack.lab304.Model.Customer;
import org.ironhack.lab304.Model.Flight;
import org.ironhack.lab304.Model.FlightBooking;
import org.ironhack.lab304.Repository.CustomerRepository;
import org.ironhack.lab304.Repository.FlightBookingRepository;
import org.ironhack.lab304.Repository.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Optional;

@SpringBootApplication
public class FlightCommandLineRunner implements CommandLineRunner {

    @Autowired
    private FlightRepository flightRepository;

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private FlightBookingRepository flightBookingRepository;

    @Override
    public void run(String... args) throws Exception {

        customerRepository.save(new Customer("Agustine Riviera", CustomerStatus.SILVER, 115235));
        customerRepository.save(new Customer("Alaina Sepulvida", CustomerStatus.NONE, 6008));
        customerRepository.save(new Customer("Tom Jones", CustomerStatus.GOLD, 205767));
        customerRepository.save(new Customer("Sam Rio", CustomerStatus.NONE, 2653));
        customerRepository.save(new Customer("Jessica James", CustomerStatus.SILVER, 27656));
        customerRepository.save(new Customer("Ana Janco", CustomerStatus.SILVER, 136773));
        customerRepository.save(new Customer("Jennifer Cortez", CustomerStatus.GOLD, 300582));
        customerRepository.save(new Customer("Christian Janco", CustomerStatus.SILVER, 14642));

        flightRepository.save(new Flight("DL122","Airbus A330", 236, 4370));
        flightRepository.save(new Flight("DL143", "Boeing 747", 400, 135));
        flightRepository.save(new Flight("DL222", "Boeing 777", 264, 1765));
        flightRepository.save(new Flight("DL37", "Boeing 747", 400, 531 ));
        flightRepository.save(new Flight("DL53", "Boeing 777", 264, 2078));

        flightBookingRepository.save(new FlightBooking(1, "DL143"));
        flightBookingRepository.save(new FlightBooking(1, "DL122"));
        flightBookingRepository.save(new FlightBooking(2, "DL122"));
        flightBookingRepository.save(new FlightBooking(1, "DL143"));
        flightBookingRepository.save(new FlightBooking(3,"DL122"));
        flightBookingRepository.save(new FlightBooking(3,"DL53"));
        flightBookingRepository.save(new FlightBooking(1, "DL143"));
        flightBookingRepository.save(new FlightBooking(4, "DL143"));
        flightBookingRepository.save(new FlightBooking(1, "DL143"));
        flightBookingRepository.save(new FlightBooking(3,"DL222"));
        flightBookingRepository.save(new FlightBooking(5,"DL143"));
        flightBookingRepository.save(new FlightBooking(4,"DL143"));
        flightBookingRepository.save(new FlightBooking(6,"DL222"));
        flightBookingRepository.save(new FlightBooking(7,"DL222"));
        flightBookingRepository.save(new FlightBooking(5,"DL122"));
        flightBookingRepository.save(new FlightBooking(4,"DL37"));
        flightBookingRepository.save(new FlightBooking(8, "DL222"));

        System.out.println("Aqui muestra todos los clientes:");
        customerRepository.findAll().forEach(customer -> System.out.println(customer.getCustomerName()));

        System.out.println("Aqui muestra todos los vuelos:");
        flightRepository.findAll().forEach(flight -> System.out.println(flight.getFlightNumber()));

        System.out.println("Solo un cliente:");
        System.out.println(customerRepository.findByCustomerName("Agustine Riviera").getCustomerName());

        System.out.println("Client by status");
        System.out.println(customerRepository.findByCustomerStatus(CustomerStatus.GOLD).toString());

        System.out.println(flightRepository.findByFlightNumber("DL122").getAircraft());
        flightRepository.findByAircraftContaining("Boeing").forEach(flight -> System.out.println(flight.getAircraft()));

        flightRepository.findByFlightMileageGreaterThan(500).forEach(flight -> System.out.println(flight.getFlightNumber()));
    }
}
