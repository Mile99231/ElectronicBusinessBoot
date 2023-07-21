package com.zretc.service;

import com.zretc.pojo.Admin;

import java.util.List;

public interface AdminService {

    //管理员登录
    Admin login(String username, String password);
    //查询所有管理员信息
    List<Admin> SelAdmin();
    //按id删除管理员
    boolean DelAdmin(int id);
    //修改管理员信息
    boolean UpdAdmin(Admin admin);
    //添加管理员信息
    boolean AddAdmin(Admin admin);

}
