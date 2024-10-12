package org.ironhack.lab304.Repository;

import org.ironhack.lab304.Model.FlightBooking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlightBookingRepository extends JpaRepository<FlightBooking, Long> {
}
