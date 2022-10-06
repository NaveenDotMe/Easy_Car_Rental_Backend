package lk.easy.rental.repo;

import lk.easy.rental.entity.Customer;
import lk.easy.rental.entity.CustomerRequest;
import lk.easy.rental.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CustomerRequestRepo extends JpaRepository<CustomerRequest,String> {


}
