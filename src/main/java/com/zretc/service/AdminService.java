package com.zretc.service;

import com.github.pagehelper.PageInfo;
import com.zretc.pojo.Admin;
import com.zretc.pojo.Business;
import com.zretc.pojo.User;
import org.apache.ibatis.annotations.Param;

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
    //按id删除商家
    boolean DelBusiness(int bid);
    //修改商家信息
    boolean UpdBusiness(Business business);
    //查询商品信息
    PageInfo<Business> busProd(int pageNo, int pageSize);
    //查看用户信息
    PageInfo<User> SelUser(int pageNo, int pageSize);
    //修改用户信息
    boolean UpdUser(User user);

    boolean UpdAdminPwd(Admin admin);

}
