package com.showproject.hospital.controller;

import com.showproject.hospital.pojo.Payment;
import com.showproject.hospital.service.PaymentService;
import com.showproject.hospital.utils.ResponseData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/payment")
public class PaymentController {
    @Autowired
    private PaymentService paymentService;

    @PostMapping("/pay")
    public ResponseData pay(@RequestBody Payment payment) {
        return paymentService.pay(payment);
    }

    @GetMapping("/order/{orderId}")
    public ResponseData getPaymentByOrder(@PathVariable Integer orderId) {
        return paymentService.getPaymentByOrder(orderId);
    }
}
