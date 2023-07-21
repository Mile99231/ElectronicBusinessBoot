package com.zretc.dao;


import com.zretc.pojo.Admin;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/*
 * 管理员操作接口
 * */
@Mapper
public interface AdminDao {
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
}
