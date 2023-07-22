package com.zretc.service;

import com.github.pagehelper.PageInfo;
import com.zretc.pojo.Admin;
import com.zretc.pojo.Business;

import java.util.List;

public interface AdminService {
    /**
     * 管理员操作
     */
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

    /**
     * 商家操作
     * 分页
     */
    //查询所有商家信息
    PageInfo<Business> SelBusiness(int pageNo,int pageSize);
    //按id删除删除
    boolean DelBusiness(int id);
    //修改商家信息
    boolean UpdBusiness(Business business);


}
