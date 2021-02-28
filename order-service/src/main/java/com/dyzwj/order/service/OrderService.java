package com.dyzwj.order.service;

import com.dyzwj.order.mapper.OrderMapper;
import com.dyzwj.order.po.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    OrderMapper orderMapper;

    public void insert(){
        Order order = new Order();
        order.setUserId(1);
        order.setProductId(1000);
        order.setStatus(1);
        order.setCount(10);
        orderMapper.insert(order);
    }

}
