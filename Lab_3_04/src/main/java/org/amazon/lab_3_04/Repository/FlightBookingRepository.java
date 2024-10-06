package org.amazon.lab_3_04.Repository;

import org.amazon.lab_3_04.Model.FlightBooking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlightBookingRepository extends JpaRepository<FlightBooking, Integer> {
}
