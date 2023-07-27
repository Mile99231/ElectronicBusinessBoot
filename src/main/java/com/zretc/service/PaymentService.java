package com.zretc.service;


import com.zretc.pojo.AlipayBean;

import java.io.IOException;

public interface PaymentService {

    public String toAlipay(AlipayBean alipayBean)throws IOException;


}

