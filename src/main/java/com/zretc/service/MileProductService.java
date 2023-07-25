package com.zretc.service;

import com.github.pagehelper.PageInfo;
import com.zretc.pojo.Product;

import java.util.List;

public interface MileProductService {
    public List<Product> Shop();

    public List<Product> selByName(String title);

    public PageInfo<Product> pages(int pageNo, int pageSize);
}
