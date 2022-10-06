package lk.easy.rental.repo;

import lk.easy.rental.entity.BookingDetails;
import org.springframework.data.jpa.repository.JpaRepository;


public interface BookingDetailRepo extends JpaRepository<BookingDetails,String> {

    boolean existsByBookingIdAndVehicleId(String bookingId,String vehicleId);

//    @Query(value = "SELECT d FROM Booking d WHERE d.bookingId b FROM bookingdetails WHERE bookingId BETWEEN =:pickUpDate AND =:returnDate")
//    String getNotBookedVehicle(@Param("pickUpDate") String pickUpDate,@Param("returnDate") String returnDate);



//    # inner join
//
//    SELECT c.Cid,c.cName,o.oId,o.date,o.cost
//    FROM Customer c INNER JOIN `Order` o
//    ON c.cId=o.cId;
//#-----
//    SELECT c.Cid,c.cName,o.oId,o.date,o.cost, od.date
//    FROM Customer c INNER JOIN `Order` o  ON c.cId=o.cId
//    INNER JOIN `Order Detail` od
//    ON o.oId= od.oId;
//
//# Left Outer Join
//
//    SELECT c.Cid,c.cName,o.oId,o.date,o.cost
//    FROM Customer c LEFT JOIN `Order` o
//    ON c.cId=o.cId;
//
//# Right Outer Join
//
//    SELECT c.Cid,c.cName,o.oId,o.date,o.cost
//    FROM Customer c RIGHT JOIN `Order` o
}
