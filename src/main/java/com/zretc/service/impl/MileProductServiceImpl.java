package com.zretc.service.impl;


import com.zretc.dao.MileProductDao;
import com.zretc.pojo.Product;
import com.zretc.service.MileProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MileProductServiceImpl implements MileProductService {
    @Autowired
    private MileProductDao mileProductDao;
    @Override
    public List<Product> Shop() {
        return mileProductDao.Shop();
    }

    @Override
    public List<Product> selByName(String title) {
        return mileProductDao.selByName(title);
    }
}
