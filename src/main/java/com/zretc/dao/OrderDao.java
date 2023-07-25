package com.zretc.dao;


import com.zretc.pojo.Order;

import java.util.List;

public interface OrderDao {
//    新增订单
    public int add(Order order);

    public List<Order> selOrder(String user);
}
