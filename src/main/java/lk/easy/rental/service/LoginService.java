package lk.easy.rental.service;

import lk.easy.rental.dto.UserDTO;

public interface LoginService {

    UserDTO loginUser(String userName, String password);
}
