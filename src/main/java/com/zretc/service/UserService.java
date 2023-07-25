package com.zretc.service;


import com.zretc.pojo.User;

public interface UserService {

     boolean userLogin(String uname,String upwd);

    public User user(String uname);

    public boolean edit(User user);

    public boolean reg(User user);

}
