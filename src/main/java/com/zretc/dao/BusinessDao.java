package com.zretc.dao;


import com.zretc.pojo.Business;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/*
* 商家操作接口
* */
public interface BusinessDao {
    Business login(String busername, String bpassword);


}
