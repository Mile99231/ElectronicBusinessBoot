package com.zretc.dao;


import com.zretc.pojo.Business;
import org.apache.ibatis.annotations.Select;

/*
* 商家操作接口
* */
public interface BusinessDao {
    Business login(String busername, String bpassword);
}
