package com.zretc.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/*
* 商家实体类
* */
@Data //Getter Setter ToString
@AllArgsConstructor  //全参构造方法
@NoArgsConstructor   //无参构造方法
public class Business {
    /*
     * 序号
     * */
    private int bid;
    /*
     * 商家用户名
     * */
    private String busername;
    /*
     * 密码
     * */
    private String bpassword;
    /*
     * 商家名称
     * */
    private String bname;
    /*
     * 手机号
     * */
    private int bphone;
    /*
     * 上架商品编号
     * */

    private List<Product> products;






    public Business(String string, String string1) {
    }
}
