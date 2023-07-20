package com.zretc.service.impl;


import com.zretc.dao.MileLunBoDao;
import com.zretc.pojo.Lunbo;
import com.zretc.service.MileLunBoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class MileLunBoServiceImpl implements MileLunBoService {
    @Autowired
    private MileLunBoDao mileLunBoDao;

    @Override
    public List<Lunbo> lunbo() {

        return mileLunBoDao.LunBo();
    }
}
