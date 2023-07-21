package com.zretc.dao;


import com.zretc.pojo.User;

/*
* 用户操作接口
* */
public interface UserDao {
//    用户登录
    User login(String uname, String upwd);
//      根据用户名查询用户信息
    User select(String uname);

}
