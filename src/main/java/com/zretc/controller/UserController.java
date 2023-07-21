package com.zretc.controller;

import com.zretc.pojo.User;
import com.zretc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("User")
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("userLogin.action")
    public Map<String,Object> userLogin(String uname,String upwd){
        Map<String,Object> maps = new HashMap<>();
        if (userService.userLogin(uname, upwd)){
            maps.put("errorcode",1);
        }else {
            maps.put("errorcode",0);
        }
        return maps;
    }
    @RequestMapping("user.action")
    private Map<String,Object> user(String uname){
        User user = userService.user(uname);
        Map<String,Object> maps = new HashMap<>();
        if (user!=null){
            maps.put("data",user);
        }else {
            maps.put("data",null);
        }
        return maps;
    }
}
