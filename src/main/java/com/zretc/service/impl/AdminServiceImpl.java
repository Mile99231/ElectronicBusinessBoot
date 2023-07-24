package com.zretc.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zretc.dao.AdminDao;
import com.zretc.pojo.Admin;
import com.zretc.pojo.Business;
import com.zretc.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
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
    @Override
    public PageInfo<Business> SelBusiness(int pageNo, int pageSize) {
        PageHelper.startPage(pageNo,pageSize);
        List<Business> businesses = adminDao.SelBusiness();

        PageInfo<Business> businessPages = new PageInfo<>(businesses);
        return businessPages;
    }

    @Override
    public boolean DelBusiness(int id) {
        return adminDao.DelBusiness(id)>0?true:false;
    }

    @Override
    public boolean UpdBusiness(Business business) {
        return adminDao.UpdBusiness(business)>0?true:false;
    }
}
