package com.zretc.controller;

import com.zretc.config.AlipayConfig;
import com.zretc.pojo.AlipayBean;
import com.zretc.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
public class PaymetController {

    @Autowired
    private PaymentService paymentService;
    @Autowired
    AlipayConfig alipayConfig;

    @PostMapping("alipay")
    public String toAlipay(@RequestBody AlipayBean alipayBean) throws IOException {
        Date date = new Date();
        // 生成订单号
        SimpleDateFormat ssddff = new SimpleDateFormat("yyyyMMddHHmmss");
        String did = ssddff.format(date);
        //获取当前时间并修改格式 订单生产的时间
        alipayBean.setOut_trade_no(did);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dtime = sdf.format(date);
        alipayBean.setDtime(dtime);
        //计算总金额
        int dddproce = alipayBean.getDsum() * alipayBean.getDprice();
        String ddproce = Integer.toString(dddproce);
        StringBuffer dproce = new StringBuffer(ddproce);
        alipayBean.setTotal_amount(dproce);

        System.out.println(alipayBean);
        String result = paymentService.toAlipay(alipayBean);
        return result;
    }
    @RequestMapping("/index")
    public String list(){
        return "index";
    }
}
