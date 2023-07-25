package com.zretc.controller;

import com.github.pagehelper.PageInfo;
import com.zretc.pojo.Business;
import com.zretc.service.BusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
@RestController
@RequestMapping("business")
public class BusinessController {
    @Autowired
    private BusinessService businessService;
    @RequestMapping("login.action")
    public Map<String,Object> login(String username,String password){
        Map<String,Object> maps = new HashMap<>();
        if (businessService.userLogin(username,password)){
            maps.put("errorcode",1);
        }else {
            maps.put("errorcode",0);
        }
        return maps;

    }



}
