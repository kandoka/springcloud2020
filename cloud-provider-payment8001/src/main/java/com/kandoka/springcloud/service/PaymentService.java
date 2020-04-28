package com.kandoka.springcloud.service;

import com.kandoka.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author: Kandoka
 * @createTime: 2020/04/28 14:56
 * @description:
 */

public interface PaymentService {

    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
