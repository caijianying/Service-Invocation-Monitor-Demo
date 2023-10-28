package com.xiaobaicai.tkmybatis;

import com.xiaobaicai.tkmybatis.entity.Payment;
import com.xiaobaicai.tkmybatis.mapper.PaymentMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * @author caijy
 * @description
 * @date 2023/10/28 星期六 3:33 下午
 */
@SpringBootTest
public class PaymentMapperTest {

    @Autowired
    PaymentMapper paymentMapper;

    @Test
    public void test(){
        List<Payment> payments = paymentMapper.selectAll();
    }
}
