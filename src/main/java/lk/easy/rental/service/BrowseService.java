package lk.easy.rental.service;

import lk.easy.rental.dto.BookingDTO;
import lk.easy.rental.dto.VehicleDTO;
import lk.easy.rental.embeded.PriceRate;
import lk.easy.rental.enums.FuelType;
import lk.easy.rental.enums.TransmissionType;
import lk.easy.rental.enums.VehicleType;

import java.time.LocalDate;
import java.util.List;

public interface BrowseService {

    List<VehicleDTO> getAllNoOfPassenger(int noOfPassenger);

    List<VehicleDTO> getAllFuelType(FuelType fuelType);

    List<VehicleDTO> getPriceRate(PriceRate priceRate);

    List<VehicleDTO> getVehicleByBrand(String brand);

    List<VehicleDTO> getVehicleByType(VehicleType type);

    List<VehicleDTO> getVehicleByTransmissionType(TransmissionType transmissionType);

    List<VehicleDTO> loadAvailableVehicles(LocalDate pickupDate, LocalDate dropOffDate);
}
