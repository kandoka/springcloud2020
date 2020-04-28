package com.kandoka.springcloud.controller;

import com.kandoka.springcloud.entities.CommonResult;
import com.kandoka.springcloud.entities.Payment;
import com.kandoka.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author: Kandoka
 * @createTime: 2020/04/28 15:01
 * @description:
 */
@RestController
@Slf4j//日志
public class PaymentController {

    @Resource
    private PaymentService paymentService;

    @PostMapping(value = "/payment/create")
    public CommonResult create(@RequestBody Payment payment) {
        int result = paymentService.create(payment);
        log.info("*********插入结果："+result);
        if(result > 0) {
            return new CommonResult(200, "插入数据库成功", result);
        }
        else {
            return new CommonResult(444, "插入数据库失败", null);
        }
    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id) {
        Payment payment = paymentService.getPaymentById(id);
        log.info("*********插入结果："+payment);
        if(payment != null) {
            return new CommonResult(200, "查询成功", payment);
        }
        else {
            return new CommonResult(444, "没有对应记录，查询ID:" + id, null);
        }
    }
}
