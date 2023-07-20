package com.zretc.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/*
* 管理员实体类
* pom文件lombok注解
* */
@Data //Getter Setter ToString
@AllArgsConstructor  //全参构造方法
@NoArgsConstructor   //无参构造方法
public class Admin {
    /*
     * 序号
     * */
    private int id;
    /*
     * 管理员用户名
     * */
    private String username;
    /*
     * 密码
     * */
    private String password;
    /*
     * 管理员名称
     * */
    private String name;
    /*
     * 性别
     * */
    private String sex;
    /*
     * 年龄
     * */
    private int age;
    /*
     * 身份证号
     * */
    private String idcard;
    /*
     * 手机号
     * */
    private int phone;


    public Admin(String string, String string1) {
    }

    public Admin(int anInt, String string, String string1, String string2, String string3, int anInt1, String string4, int anInt2, String string5) {
    }

    public Admin(String username, String password, String name, String sex, int age, String idcard, int phone) {
    }
}
