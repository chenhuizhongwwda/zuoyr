package com.showproject.hospital.mapper;

import com.showproject.hospital.pojo.Payment;
import org.apache.ibatis.annotations.*;

@Mapper
public interface PaymentMapper {
    @Insert("INSERT INTO payment (o_id, pay_time, pay_amount, pay_method, pay_state) VALUES (#{oId}, #{payTime}, #{payAmount}, #{payMethod}, #{payState})")
    int insertPayment(Payment payment);

    @Select("SELECT * FROM payment WHERE o_id = #{oId}")
    Payment selectByOrderId(Integer oId);
}
