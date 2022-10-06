package lk.easy.rental.repo;

import lk.easy.rental.entity.User;
import lk.easy.rental.entity.UserRequest;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRequestRepo extends JpaRepository<UserRequest,Integer> {

//    User findByUserName(String username);
//
//    boolean existsByUserName(String name);
//
//    Optional<User> findByUserId(int userId);
//
//    User findByUserNameAndPassword(String userName, String password);


}
