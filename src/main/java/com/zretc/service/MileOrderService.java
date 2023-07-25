package com.zretc.service;

import com.zretc.pojo.Order;

import java.util.List;

public interface MileOrderService {
    public boolean add(String user, String dname, int sum, double price,int proid);

    public List<Order> selOrder(String user);
}
