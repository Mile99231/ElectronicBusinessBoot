package com.zretc.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/*
* 用户实体类 (登录)
* */
@Data //Getter Setter ToString
@AllArgsConstructor  //全参构造方法
@NoArgsConstructor   //无参构造方法
public class User {
    /*
     * 序号
     * */
    private int id;
    /*
     * 用户名
     * */
    private String uname;
    /*
     * 密码
     * */
    private String upwd;
    /*
     * 手机号
     * */
    private int uphone;
    /*
     * 最近一次登陆时间
     * */
    private String ulasttime;

    public User(String string, String string1) {
    }
}