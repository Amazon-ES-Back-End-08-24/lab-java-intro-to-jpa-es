package org.ironhack.lab304.Repository;

import org.ironhack.lab304.Enum.CustomerStatus;
import org.ironhack.lab304.Model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

    Customer findByCustomerName(String CustomerName);
    List<Customer> findByCustomerStatus(CustomerStatus status);


    //String findByCustomerStatus(CustomerStatus customerStatus);
}
