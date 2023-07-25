package com.zretc.service.impl;

import com.zretc.dao.AddressDao;
import com.zretc.pojo.Address;
import com.zretc.service.MileAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MileAddressServiceImpl implements MileAddressService {
    @Autowired
    private AddressDao addressDao;

    @Override
    public boolean address(Address address) {
        if (addressDao.add(address)>0){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public List<Address> select(String user) {
        return addressDao.select(user);
    }

}
