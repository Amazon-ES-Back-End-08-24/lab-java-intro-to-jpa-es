package org.ironhack.lab_introduccion_jpa.repository;


import org.ironhack.lab_introduccion_jpa.model.Customer;
import org.ironhack.lab_introduccion_jpa.model.CustomerStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

//Crea repositorios JPA para las clases Customer utilizando la interfaz JpaRepository.

@Repository
public interface CustomerRepository extends JpaRepository <Customer, Integer> {
    // queries
    // Buscar clientes por nombre
    List<Customer> findByCustomerName(String customerName);

    // Buscar clientes por estado (Gold, Silver, None)
    List<Customer> findByCustomerStatus(CustomerStatus customerStatus);


}
