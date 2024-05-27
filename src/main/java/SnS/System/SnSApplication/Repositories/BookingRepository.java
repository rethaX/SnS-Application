package SnS.System.SnSApplication.Repositories;

import SnS.System.SnSApplication.Entity.Booking;
import org.springframework.data.jpa.repository.JpaRepository;


public interface BookingRepository extends JpaRepository<Booking, Long> {
}
