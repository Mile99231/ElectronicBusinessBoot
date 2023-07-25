package com.zretc.service;

import com.zretc.pojo.Address;

import java.util.List;

public interface MileAddressService {

    public boolean address(Address address);

    public List<Address> select(String user);
}
