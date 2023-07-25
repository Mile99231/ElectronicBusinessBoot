package com.zretc.dao;


import com.zretc.pojo.Address;

import java.util.List;

public interface AddressDao {
    //新增收获地址
    public int add(Address add);
    //查询收获地址
    public List<Address> select(String user);
}
