package com.dyzwj.order.mapper;

import com.dyzwj.order.po.Order;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.transaction.annotation.Transactional;

@Mapper
public interface OrderMapper {

    @Transactional
    @Insert("insert into `order`(user_id,product_id,count,money,`status`) values(#{userId},#{productId},#{count},#{money},#{status})")
    void insert(Order order);

}
