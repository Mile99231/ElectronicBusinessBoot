package com.zretc.dao;


import com.zretc.pojo.User;

/*
* 用户操作接口
* */
public interface UserDao {
    User login(String uname, String upwd);

    User select(String user);

}
