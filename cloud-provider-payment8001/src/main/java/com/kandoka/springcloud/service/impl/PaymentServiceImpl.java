package com.kandoka.springcloud.service.impl;

import com.kandoka.springcloud.dao.PaymentDao;
import com.kandoka.springcloud.entities.Payment;
import com.kandoka.springcloud.service.PaymentService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author: Kandoka
 * @createTime: 2020/04/28 14:57
 * @description:
 */
@Service
public class PaymentServiceImpl implements PaymentService{
    @Resource
    private PaymentDao paymentDao;

    public int create(Payment payment){
        return paymentDao.create(payment);
    }

    public Payment getPaymentById(@Param("id") Long id){
        return paymentDao.getPaymentById(id);
    }
}
