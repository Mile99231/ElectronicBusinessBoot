package com.zretc.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zretc.dao.AdminDao;
import com.zretc.dao.BusinessDao;
import com.zretc.pojo.Admin;
import com.zretc.pojo.Business;
import com.zretc.pojo.User;
import com.zretc.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminDao adminDao;


    /**
     * 管理员操作
     */
    @Override
    public Admin login(String username, String password) {
        return adminDao.login(username, password);
    }

    @Override
    public List<Admin> SelAdmin() {
        return adminDao.SelAdmin();
    }

    @Override
    public boolean DelAdmin(int id) {
        return adminDao.DelAdmin(id)>0?true:false;
    }

    @Override
    @Transactional
    public boolean UpdAdmin(Admin admin) {
        return adminDao.UpdAdmin(admin)>0?true:false;
    }

    @Override
    @Transactional
    public boolean AddAdmin(Admin admin) {
        return adminDao.AddAdmin(admin)>0?true:false;
    }



    /**
     * 商家操作
     */

    /**
     * 管理员查询商家
     */
    @Override
    public PageInfo<Business> SelBusiness(int pageNo, int pageSize) {
        PageHelper.startPage(pageNo,pageSize);
        List<Business> businesses = adminDao.SelBusiness();

        PageInfo<Business> businessPages = new PageInfo<>(businesses);
        return businessPages;
    }
    /**
     * 管理员删除商家
     */
    @Override
    public boolean DelBusiness(int bid) {
        return adminDao.DelBusiness(bid)>0?true:false;
    }
    /**
     * 管理员修改商家
     */
    @Override
    public boolean UpdBusiness(Business business) {
        return adminDao.UpdBusiness(business)>0?true:false;
    }


    /**
     * 商品操作
     */
    @Override
    public PageInfo<Business> busProd(int pageNo, int pageSize) {
        PageHelper.startPage(pageNo,pageSize);
        List<Business> businesses = adminDao.busProd();

        PageInfo<Business> businessPages = new PageInfo<>(businesses);
        return businessPages;
    }
    /**
     * 用户操作
     */

    /**
     * 管理员查询用户
     */
    @Override
    public PageInfo<User> SelUser(int pageNo, int pageSize) {
        PageHelper.startPage(pageNo,pageSize);
        List<User> users = adminDao.SelUser();

        PageInfo<User> users1 = new PageInfo<>(users);
        return users1;
    }

    @Override
    public boolean UpdUser(User user) {
        return adminDao.UpdUser(user)>0?true:false;
    }

    @Override
    public boolean UpdAdminPwd(Admin admin) {

        return adminDao.UpdAdminPwd(admin)>0?true:false;
    }


}
