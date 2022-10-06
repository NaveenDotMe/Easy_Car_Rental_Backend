package lk.easy.rental.service;

import lk.easy.rental.dto.CustomerDTO;

import java.util.List;

public interface CustomerService {

    void saveCustomer(CustomerDTO customerDTO);
    void deleteCustomer(String id);
    void updateCustomer(CustomerDTO customerDTO);
    CustomerDTO searchCustomer(String id);
    List<CustomerDTO> getAllCustomer();
    String generateCustomerIds();
    long countCustomer();
    CustomerDTO getCustomerInUserName(String userName);
}
