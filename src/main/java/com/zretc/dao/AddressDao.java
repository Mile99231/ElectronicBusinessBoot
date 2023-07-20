package com.zretc.dao;


import com.zretc.pojo.Address;

import java.util.List;

public interface AddressDao {
    public int add(Address add);

    public List<Address> select(String user);
}
