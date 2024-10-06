package org.amazon.lab_3_04.Repository;

import org.amazon.lab_3_04.Model.Customer;
import org.amazon.lab_3_04.Model.CustomerStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
    List<Customer> findByCustomerName(String name);
    List<Customer> findCustomerByCustomerStatus(String status);

}
