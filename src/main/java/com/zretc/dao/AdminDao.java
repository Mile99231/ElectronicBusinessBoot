package com.zretc.dao;


import com.zretc.pojo.Admin;
import com.zretc.pojo.Business;
import com.zretc.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/*
 * 管理员操作接口
 * */
@Mapper
public interface AdminDao {
    /**
    * 管理员操作
    */

    //管理员登录
    Admin login(String username, String password);
    //查询所有管理员信息
    List<Admin> SelAdmin();
    //按id删除管理员
    int DelAdmin(int id);
    //修改管理员信息
    int UpdAdmin(Admin admin);
    //添加管理员信息
    int AddAdmin(Admin admin);

    /**
    * 商家操作
    */
    //查询所有商家信息
    List<Business> SelBusiness();
    //按id删除删除
    int DelBusiness(int bid);
    //修改商家信息
    int UpdBusiness(Business business);
    //查看商品信息
    List<Business> busProd();
    //查看用户信息
    List<User> SelUser();
    //修改用户信息
    int UpdUser(User user);

    int UpdAdminPwd(Admin admin);

}
