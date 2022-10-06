package lk.easy.rental.service;

import lk.easy.rental.dto.CustomerDTO;
import lk.easy.rental.dto.UserDTO;
import lk.easy.rental.jwt.AuthenticationRequest;
import org.springframework.http.ResponseEntity;

public interface UserService {

    ResponseEntity<?> logInUser(AuthenticationRequest authenticationRequest);

    //ResponseEntity<?> signUpCustomer(CustomerDTO customerDTO);

}
