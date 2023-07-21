package com.zretc.controller;

import com.zretc.pojo.Address;
import com.zretc.service.MileAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.annotation.MultipartConfig;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@Controller
@RequestMapping("address")
public class MileAddressController {
    @Autowired
    private MileAddressService mileAddressService;


    @RequestMapping("add.action")
    @ResponseBody
    public Map<String,Object> add(String name,String radio,String phone,String addrss,String user){
        System.out.println(name+"    "+radio);
        Map<String,Object> maps = new HashMap<>();
        Address ad = new Address(name,radio,phone,addrss,user);
        if (mileAddressService.address(ad)){
            maps.put("errorcode",1);
        }else {
            maps.put("errorcode",101);
        }
        return maps;

    }
    @RequestMapping("sel.action")
    @ResponseBody
    public Map<String,Object> sel(String name){
        List<Address> select = mileAddressService.select(name);
        Map<String,Object> maps = new HashMap<>();
        maps.put("data",select);
        return maps;

    }
}
