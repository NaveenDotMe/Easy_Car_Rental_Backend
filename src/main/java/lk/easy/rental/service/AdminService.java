package lk.easy.rental.service;

import lk.easy.rental.dto.AdminDTO;
import lk.easy.rental.dto.CustomerDTO;


import java.util.List;

public interface AdminService {

    void saveAdmin(AdminDTO adminDTO);
    void deleteAdmin(String id);
    void updateAdmin(AdminDTO adminDTO);
    AdminDTO searchAdmin(String id);
    List<AdminDTO> getAllAdmin();
    String generateAdminIds();
    long countAdmin();
    AdminDTO getAdminInUserName(String userName);
    void acceptCustomer(CustomerDTO dto);

    void denyCustomer(String denyCustomer);
    void notifyMaintenance();

//    void acceptBookingRequest(String id);
//
//    void denyBookingRequest(String id,String reason);
}
