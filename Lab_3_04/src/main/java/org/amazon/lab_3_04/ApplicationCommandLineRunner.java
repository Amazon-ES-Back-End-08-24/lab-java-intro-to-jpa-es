package org.amazon.lab_3_04;

import org.amazon.lab_3_04.Model.Customer;
import org.amazon.lab_3_04.Model.Flight;
import org.amazon.lab_3_04.Repository.CustomerRepository;
import org.amazon.lab_3_04.Repository.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ApplicationCommandLineRunner implements CommandLineRunner {

    @Autowired
    private CustomerRepository customerRepository;
    @Autowired
    private FlightRepository flightRepository;

    @Override
    public void run(String... args) throws Exception {

    Customer customer1 = new Customer("Tom Jones","Gold",205767);
    Customer customer2 = new Customer("Tom Jones","Gold",5767);
    Customer customer3 = new Customer("Sam Rio","None",2653);
    Customer customer4 = new Customer("Sam Rio","None",653);
    Customer customer5 = new Customer("Jessica James","Silver",127656);
    Customer customer6 = new Customer("Jessica James","Silver",127656);
    Customer customer7 = new Customer("Jennifer Cortez","Gold",300582);
    Customer customer8 = new Customer("Christian Janco","Silver",14642);
    Customer customer9 = new Customer("Ana Janco","Silver",136773);
    Customer customer10 = new Customer("Alaina Selpulvida","None",6008);
    Customer customer11 = new Customer("Agustine Rivera","None",115235);
    Customer customer12 = new Customer("Agustine Rivera","Silver",115235);
        customerRepository.save(customer1);
        customerRepository.save(customer2);
        customerRepository.save(customer3);
        customerRepository.save(customer4);
        customerRepository.save(customer5);
        customerRepository.save(customer6);
        customerRepository.save(customer7);
        customerRepository.save(customer8);
        customerRepository.save(customer9);
        customerRepository.save(customer10);
        customerRepository.save(customer11);
        customerRepository.save(customer12);

        List<Customer> customers = customerRepository.findAll();
        for (Customer customer : customers) {
            System.out.println(customer);
        }
        System.out.println("--------------------------------------------------------------");
        Flight flight1 = new Flight("DL122","Airbus A330",236,4370);
        Flight flight2 = new Flight("DL143","Boeing 747",400,135);
        Flight flight3 = new Flight("DL37","Boeing 747",747,531);
        Flight flight4 = new Flight("DL222","Boeing 777",264,1765);
        Flight flight5 = new Flight("DL53","Boeing 777",264,2078);
        flightRepository.save(flight1);
        flightRepository.save(flight2);
        flightRepository.save(flight3);
        flightRepository.save(flight4);
        flightRepository.save(flight5);

        List<Flight> flights = flightRepository.findAll();
        for (Flight flight : flights) {
            System.out.println(flight);

        }
        System.out.println("--------------------------------------------------------------");

       List<Customer> customerExample = customerRepository.findByCustomerName("Tom Jones");
        System.out.println(customerExample);

        List<Customer> statusExample = customerRepository.findCustomerByCustomerStatus("Gold");
        System.out.println(statusExample);
        System.out.println("-----------------------------------------------------------");

        List<Flight> findFlights = flightRepository.findByFlightNumber("DL122");
        System.out.println(findFlights);
        System.out.println("--------------------------------------------------------------");

        List<Flight> findContains = flightRepository.findByAircraftContaining("Boeing");
        System.out.println(findContains);
        System.out.println("--------------------------------------------------------------");

        List<Flight> findflightmilagegreatenthan = flightRepository.findByFlightMileageGreaterThan(500);
        System.out.println(findflightmilagegreatenthan);

    }
}
