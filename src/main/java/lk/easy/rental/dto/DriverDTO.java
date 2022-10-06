package lk.easy.rental.dto;

import lk.easy.rental.embeded.Name;
import lk.easy.rental.enums.AvailabilityType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class DriverDTO {

    private String id;
    private String nic;
    private Name name;
    private String address;
    private String drivingLicenseNo;
    private String email;
    private String contactNo;
    private UserDTO user;
    private AvailabilityType driverAvailability;

}
