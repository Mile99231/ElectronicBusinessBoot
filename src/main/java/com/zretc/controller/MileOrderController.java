package com.zretc.controller;

import com.zretc.pojo.Order;
import com.zretc.service.MileOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
@RequestMapping("order")
public class MileOrderController {
    @Autowired
    private MileOrderService mileOrderService;
    @ResponseBody
    @RequestMapping("add.action")
    public Map<String,Object> add(String user,String dname,int num,double price,int proid){

        Map<String,Object> maps = new HashMap<>();
        if (mileOrderService.add(user, dname, num, price,proid)){
            //errorcode 1 为成功
            maps.put("errorcode",1);
        }else {
            maps.put("errorcode",101);
        }
        return maps;
    }
    @ResponseBody
    @RequestMapping("sel.action")
    private Map<String,Object> selOrder(String user){
        Map<String,Object> maps = new HashMap<>();
        List<Order> orders = mileOrderService.selOrder(user);
        maps.put("data",orders);
        return maps;
    }
}
