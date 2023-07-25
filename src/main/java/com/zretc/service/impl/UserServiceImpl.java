package com.zretc.service.impl;


import com.zretc.dao.UserDao;
import com.zretc.pojo.User;
import com.zretc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.xml.crypto.Data;
import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Override
    public boolean userLogin(String uname,String upwd) {
        //调用userDao中的login方法 返回值为User对象 为空返回false 不为空返回true
        if (userDao.login(uname, upwd)!=null){
            return true;
        }else {
            return false;
        }

    }

    @Override
    public User user(String uname) {
        User user = userDao.select(uname);
        return user;
    }

    @Override
    public boolean edit(User user) {
        return userDao.edit(user)>0?true:false;
    }

    @Override
    public boolean reg(User user) {
        Date date = new Date();
        SimpleDateFormat ssddff = new SimpleDateFormat("yyyy-MM-dd");
        String did = ssddff.format(date);
        user.setUlasttime(did);
        return userDao.reg(user)>0?true:false;
    }
}
