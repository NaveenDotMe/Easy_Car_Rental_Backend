package lk.easy.rental.dto;

import lk.easy.rental.embeded.Mileage;
import lk.easy.rental.embeded.PriceRate;
import lk.easy.rental.enums.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class VehicleDTO {

    private String vehicleId;
    private String registrationNo;
    private String vehicleBrand;
    private VehicleType vehicleType;
    private FuelType fuelType;
    private int numberOfPassenger;
    private String vehicleColour;
    private TransmissionType transmissionType;
    private double refundableDamagedFee;
    private int vehicleMileage;
    private PriceRate vehiclePriceRate;
    private Mileage freeMileage;
    private int lastServiceMileage;
    private double extraKmPer;
    private AvailabilityType vehicleAvailability;
    private RequestType needMaintenance;
}
