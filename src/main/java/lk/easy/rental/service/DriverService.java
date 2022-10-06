package lk.easy.rental.service;

import lk.easy.rental.dto.CustomerDTO;
import lk.easy.rental.dto.DriverDTO;

import java.time.LocalDate;
import java.util.List;

public interface DriverService {

    void saveDriver(DriverDTO driverDTO);
    void deleteDriver(String id);
    void updateDriver(DriverDTO driverDTO);
    DriverDTO searchDriver(String id);
    List<DriverDTO> getAllDriver();
    String generateDriverIds();
    long countDrivers();
    DriverDTO getDriverInUserName(String userName);
    DriverDTO loadAvailableDriver(LocalDate pickupDate, LocalDate dropOffDate);
    DriverDTO getAvailableDriver();
}
