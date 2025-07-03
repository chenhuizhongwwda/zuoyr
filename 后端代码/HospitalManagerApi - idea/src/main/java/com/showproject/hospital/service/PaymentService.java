package com.showproject.hospital.service;

import com.showproject.hospital.pojo.Payment;
import com.showproject.hospital.utils.ResponseData;

public interface PaymentService {
    ResponseData pay(Payment payment);
    ResponseData getPaymentByOrder(Integer orderId);
}
