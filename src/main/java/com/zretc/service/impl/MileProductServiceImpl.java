package com.zretc.service.impl;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
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

    @Override
    public PageInfo<Product> pages(int pageNo, int pageSize) {
        PageHelper.startPage(pageNo,pageSize);
        List<Product> byPages = mileProductDao.getByPages();
        PageInfo<Product> productPages = new PageInfo<>(byPages);
        return productPages;
    }
}















