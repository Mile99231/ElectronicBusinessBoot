package com.zretc.controller;

import com.zretc.pojo.User;
import com.zretc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.RequestBody;
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
        String password = DigestUtils.md5DigestAsHex((uname+"{"+upwd+"}").getBytes());

        Map<String,Object> maps = new HashMap<>();
        if (userService.userLogin(uname, password)){
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
    @RequestMapping("save.action")
    public Map<String,Object> save(@RequestBody User user){
        String password = DigestUtils.md5DigestAsHex((user.getUname()+"{"+user.getUpwd()+"}").getBytes());
        user.setUpwd(password);
        user.setAvatarUrl(null);
        Map<String,Object> maps = new HashMap<>();
        if (userService.edit(user)){
            maps.put("errorcode",0);
        }else {
            maps.put("errorcode",101);
        }
        return maps;
    }
    @RequestMapping("reg.action")
    public Map<String,Object> reg(@RequestBody User user){
        String password = DigestUtils.md5DigestAsHex((user.getUname()+"{"+user.getUpwd()+"}").getBytes());
        user.setUpwd(password);
        Map<String,Object> maps = new HashMap<>();
        if (userService.reg(user)){
            maps.put("errorcode",1);
        }else {
            maps.put("errorcode",101);
        }
        return maps;
    }
}
