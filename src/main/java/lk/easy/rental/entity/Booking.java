package lk.easy.rental.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lk.easy.rental.enums.RequestType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@ToString
public class Booking {

    @Id
    private String bookingId;
    @Column(name = "pick_up_date")
    private LocalDate pickUpDate;
    @Column(name = "pick_up_time")
    private LocalTime pickUpTime;
    @Column(name = "return_date")
    private LocalDate returnDate;
    @Column(name = "pick_up_location")
    private String pickUpLocation;
    @Enumerated(EnumType.STRING)
    @Column(name = "driver_request_type")
    private RequestType driverRequestType;

    @ManyToOne(cascade = {CascadeType.DETACH,CascadeType.REFRESH})
    @JoinColumn(name = "custId",referencedColumnName = "id",nullable = false)
    private Customer customer;

    @OneToMany(mappedBy = "booking",cascade = CascadeType.ALL)
    private List<BookingDetails> bookingDetails;

    @OneToMany(mappedBy = "booking",cascade = CascadeType.ALL)
    private List<DriverSchedule> driverSchedules;



}
