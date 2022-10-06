package lk.easy.rental.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lk.easy.rental.enums.PaymentType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class PaymentDTO {

    private String paymentId;
    @JsonFormat(pattern="yyyy-MM-dd")
    private LocalDate paymentDate;
    private String invoiceNo;
    private double amount;
    private PaymentType paymentType;
    private BookingDTO booking;
}
