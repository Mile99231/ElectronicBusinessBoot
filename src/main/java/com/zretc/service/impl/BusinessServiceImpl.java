package com.zretc.service.impl;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zretc.dao.BusinessDao;
import com.zretc.pojo.Business;
import com.zretc.service.BusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Component
public class BusinessServiceImpl implements BusinessService {

    @Autowired
    private BusinessDao businessDao;
    @Override
    public boolean userLogin(String uname, String upwd) {

            return businessDao.login(uname, upwd)!=null?true:false;

    }



}
