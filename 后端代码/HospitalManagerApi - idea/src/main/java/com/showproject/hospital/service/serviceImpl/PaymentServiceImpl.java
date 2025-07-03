package com.showproject.hospital.service.serviceImpl;

import com.showproject.hospital.mapper.OrderMapper;
import com.showproject.hospital.mapper.PaymentMapper;
import com.showproject.hospital.pojo.Orders;
import com.showproject.hospital.pojo.Payment;
import com.showproject.hospital.service.PaymentService;
import com.showproject.hospital.utils.ResponseData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class PaymentServiceImpl implements PaymentService {
    @Autowired
    private PaymentMapper paymentMapper;
    @Autowired
    private OrderMapper orderMapper;

    @Override
    public ResponseData pay(Payment payment) {
        // 1. 校验订单是否存在且未支付
        Orders order = orderMapper.selectById(payment.getOId());
        if (order == null) {
            return ResponseData.fail("订单不存在");
        }
        if (order.getOPriceState() != null && order.getOPriceState() == 1) {
            return ResponseData.fail("订单已支付");
        }
        // 2. 模拟支付成功
        payment.setPayTime(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
        payment.setPayState(1); // 1=已支付
        paymentMapper.insertPayment(payment);

        // 3. 更新订单支付状态
        order.setOPriceState(1);
        orderMapper.updateOrderPriceState(order.getOId(), 1);

        return ResponseData.success("支付成功");
    }

    @Override
    public ResponseData getPaymentByOrder(Integer orderId) {
        Payment payment = paymentMapper.selectByOrderId(orderId);
        if (payment == null) {
            return ResponseData.fail("无支付记录");
        }
        return ResponseData.success(String.valueOf(payment));
    }
}
