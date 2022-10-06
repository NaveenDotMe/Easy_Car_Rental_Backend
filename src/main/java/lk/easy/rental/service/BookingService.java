package lk.easy.rental.service;

import lk.easy.rental.dto.BookingDTO;

import java.util.List;

public interface BookingService {

    void saveBooking(BookingDTO bookingDTO);
    void deleteBooking(String id);
    void updateBooking(BookingDTO bookingDTO);
    BookingDTO searchBooking(String id);
    List<BookingDTO> getAllBooking();
    String generateBookingIds();
    long countBooking();
}
