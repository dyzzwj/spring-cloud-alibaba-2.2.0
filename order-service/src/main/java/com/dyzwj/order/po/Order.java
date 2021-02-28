package com.dyzwj.order.po;

import lombok.Data;

@Data
public class Order {

    private int id;

    private int userId;

    private int productId;

    private int count;

    private double money;

    private int status;

}
