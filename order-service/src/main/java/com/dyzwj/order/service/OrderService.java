package com.dyzwj.order.service;

import com.dyzwj.order.feign.AccountFeignClient;
import com.dyzwj.order.feign.StorageFeignClient;
import com.dyzwj.order.mapper.OrderMapper;
import com.dyzwj.order.po.Order;
import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    OrderMapper orderMapper;

    @Autowired
    AccountFeignClient accountFeignClient;

    @Autowired
    StorageFeignClient storageFeignClient;

    @GlobalTransactional
    public void insert(){

        Order order = new Order();
        order.setUserId(1);
        order.setProductId(1000);
        order.setStatus(1);
        order.setCount(10);
        orderMapper.insert(order);


        accountFeignClient.decreaseAccount();

        int i = 10 / 0;

        storageFeignClient.decreaseStorage();


    }

}
