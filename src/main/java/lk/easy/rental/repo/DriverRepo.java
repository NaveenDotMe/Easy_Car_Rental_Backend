package lk.easy.rental.repo;

import lk.easy.rental.entity.Customer;
import lk.easy.rental.entity.Driver;
import lk.easy.rental.entity.User;
import lk.easy.rental.enums.AvailabilityType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface DriverRepo extends JpaRepository<Driver,String> {

    @Query(value = "SELECT id FROM driver ORDER BY id DESC LIMIT 1", nativeQuery = true)
    String generateDriverId();

    Driver findByUser(User byId);

    Driver findFirstByDriverAvailability(AvailabilityType availability);
}
