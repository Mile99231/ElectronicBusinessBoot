package com.zretc.service.impl;

import com.zretc.dao.OrderDao;
import com.zretc.pojo.Order;
import com.zretc.service.MileOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class MileOrderServiceImpl implements MileOrderService {
    @Autowired
    private OrderDao orderDao;

    @Override
    public boolean add(String user, String dname, int sum, double price,int proid) {
        Date date = new Date();

        // 生成订单号
        SimpleDateFormat ssddff = new SimpleDateFormat("yyyyMMddHHmmss");
        String did = ssddff.format(date);
        //获取当前时间并修改格式 订单生产的时间
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dtime = sdf.format(date);

        //计算总金额
        double dproce = sum * price;

//商品名称dname
// 商品价格price
// 商品数量sum
// 用户名称user
//订单号did
//订单生成时间dtime
        Order order = new Order(did,dname,proid,price,sum,dtime,user);
        return  orderDao.add(order)>0;
    }

    @Override
    public List<Order> selOrder(String user) {
        return orderDao.selOrder(user);
    }


}
