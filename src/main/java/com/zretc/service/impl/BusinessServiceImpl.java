package com.zretc.service.impl;


import com.zretc.dao.BusinessDao;
import com.zretc.service.BusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class BusinessServiceImpl implements BusinessService {

    @Autowired
    private BusinessDao businessDao;
    @Override
    public boolean userLogin(String uname, String upwd) {
        if (businessDao.login(uname, upwd)!=null){
            return true;
        }else {
            return false;
        }
    }
}
