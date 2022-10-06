package lk.easy.rental.repo;

import lk.easy.rental.entity.Customer;
import lk.easy.rental.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CustomerRepo extends JpaRepository<Customer,String> {

    @Query(value = "SELECT id FROM Customer ORDER BY id DESC LIMIT 1", nativeQuery = true)
    String generateCustomerId();


    Customer findByUser(User byId);
}
