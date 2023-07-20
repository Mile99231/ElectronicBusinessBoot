package com.zretc.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/*
* 用户信息实体类
* */
@Data //Getter Setter ToString
@AllArgsConstructor  //全参构造方法
@NoArgsConstructor   //无参构造方法
public class UserInfo {
    /*
    * 序号
    * */
    private int id;
    /*
    * 用户名
    * */
    private String uname;
    /*
     * 用户密码
     * */
    private String upwd;
    /*
     * 年龄
     * */
    private int uage;
    /*
     * 性别
     * */
    private String usex;
    /*
     * 收货手机号
     * */
    private int uphone;
    /*
     * 收货座机号
     * */
    private int ureceivephone;
    /*
     * 收货地址
     * */
    private String uaddress;
    /*
     * 邮编
     * */
    private int uzipcode;
    /*
     * 会员等级
     * */
    private String uviplevel;
    /*
     * 头像
     * */
    private String uimage;

}
