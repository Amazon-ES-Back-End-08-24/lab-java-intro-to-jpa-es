package org.ironhack.lab_introduccion_jpa.model;
import jakarta.persistence.*;

//Crea una clase llamada model.Customer con las siguientes variables:
//
//customerId (integer): un identificador único generado automáticamente, miembro privado
//customerName (string): miembro privado
//customerStatus (string): que representa un enum, miembro privado
//totalCustomerMileage (integer): miembro privado
//Agrega un constructor vacío a la clase model.Customer para que Hibernate cree nuevas instancias de la clase.
//Agrega un constructor parametrizado a la clase model.Customer que tome customerName, customerStatus y totalCustomerMileage como parámetros.
//Agrega métodos getter y setter públicos para cada variable en la clase model.Customer.

@Entity
@Table(name = "customer")

public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer customerId;

    @Column(name = "customer_name")
    private String customerName;

    @Enumerated(EnumType.STRING)
    @Column(name = "customer_status")
    private CustomerStatus customerStatus;

    @Column(name = "total_customer_mileage")
    private Integer totalCustomerMileage;

    // Constructor vacío
    public Customer() {}

    // Constructor parametrizado
    public Customer(String customerName, org.ironhack.lab_introduccion_jpa.model.CustomerStatus customerStatus, Integer totalCustomerMileage) {
        this.customerName = customerName;
        this.customerStatus = customerStatus;
        this.totalCustomerMileage = totalCustomerMileage;
    }

    // Getters y Setters
    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public org.ironhack.lab_introduccion_jpa.model.CustomerStatus getCustomerStatus() {
        return customerStatus;
    }

    public void setCustomerStatus(org.ironhack.lab_introduccion_jpa.model.CustomerStatus customerStatus) {
        this.customerStatus = customerStatus;
    }

    public Integer getTotalCustomerMileage() {
        return totalCustomerMileage;
    }

    public void setTotalCustomerMileage(Integer totalCustomerMileage) {
        this.totalCustomerMileage = totalCustomerMileage;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId=" + customerId +
                ", customerName='" + customerName + '\'' +
                ", customerStatus=" + customerStatus +
                ", totalCustomerMileage=" + totalCustomerMileage +
                '}';
    }
}
