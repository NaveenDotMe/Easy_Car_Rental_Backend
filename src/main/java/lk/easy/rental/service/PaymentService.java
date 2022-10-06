package lk.easy.rental.service;

import lk.easy.rental.dto.DriverDTO;
import lk.easy.rental.dto.PaymentDTO;

import java.util.List;

public interface PaymentService {

    void savePayment(PaymentDTO paymentDTO);
    void deletePayment(String id);
    void updatePayment(PaymentDTO paymentDTO);
    PaymentDTO searchPayment(String id);
    List<PaymentDTO> getAllPayment();
    String generatePaymentIds();
}
