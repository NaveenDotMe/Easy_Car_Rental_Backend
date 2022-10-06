package lk.easy.rental.service;

import lk.easy.rental.dto.VehicleDTO;

import java.util.List;

public interface VehicleService {

    void saveVehicle(VehicleDTO vehicleDTO);
    void deleteVehicle(String id);
    void updateVehicle(VehicleDTO vehicleDTO);
    VehicleDTO searchVehicle(String id);
    List<VehicleDTO> getAllVehicle();
    String generateVehicleIds();
    int brandAndTypeCount(String brand, String type);
    long countVehicle();
    void makeVehicleUnavailable(String vehicleId);

    void makeVehicleAvailable(String vehicleId);
}
