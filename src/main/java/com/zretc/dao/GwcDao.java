package com.zretc.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zretc.pojo.Gwc;

import java.util.List;

public interface GwcDao extends BaseMapper<Gwc> {
    //查询购物车
    public List<Gwc> sel(String user);
    //添加购物车
    public int add(Gwc gwc);

    //根据id删除

}
