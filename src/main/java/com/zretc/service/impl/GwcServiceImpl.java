package com.zretc.service.impl;

import com.zretc.dao.GwcDao;
import com.zretc.pojo.Gwc;
import com.zretc.service.GwcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class GwcServiceImpl implements GwcService {
    @Autowired
    private GwcDao gwcDao;

    @Override
    public List<Gwc> sel(String user) {
        return gwcDao.sel(user);
    }

    @Override
    public boolean add(Gwc gwc) {

        Date date = new Date();
        SimpleDateFormat ssddff = new SimpleDateFormat("yyyy-MM-dd");
        String did = ssddff.format(date);
        gwc.setGcreatetime(did);

        return gwcDao.add(gwc)>0?true:false;
    }

    @Override
    public boolean del(int gid) {
        return gwcDao.deleteById(gid)>0?true:false;
    }

    @Override
    public boolean delByIds(List<Integer> ids) {
        return gwcDao.deleteBatchIds(ids)>0?true:false;
    }


}
