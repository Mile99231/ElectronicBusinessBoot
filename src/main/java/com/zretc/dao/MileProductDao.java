package com.zretc.dao;

import com.zretc.pojo.Product;

import java.util.List;

public interface MileProductDao {
    //查询全部商品
    public List<Product> Shop();
    //搜索框 根据名字 或 空查询全部
    public List<Product> selByName(String title);
    //分页查询
    public List<Product> getByPages();
}
