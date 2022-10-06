package lk.easy.rental.repo;

import lk.easy.rental.entity.Booking;
import lk.easy.rental.entity.BookingDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;


public interface BookingRepo extends JpaRepository<Booking,String> {

    List<Booking> findAllByReturnDateIsAfterAndPickUpDateIsBefore(LocalDate pickUpDate, LocalDate returnDate);

    @Query(value = "SELECT bookingId FROM booking ORDER BY bookingId DESC LIMIT 1", nativeQuery = true)
    String generateBookingIds();




}
