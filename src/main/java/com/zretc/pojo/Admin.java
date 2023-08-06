package com.zretc.pojo;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/*
* 管理员实体类
* pom文件lombok注解
* */

public class Admin {
    /*
     * 序号
     * */
    @TableId
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public Admin() {
    }

    public Admin(int id, String username, String password, String name, String sex, int age, String idcard, int phone) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.idcard = idcard;
        this.phone = phone;
    }

    public Admin(String username, String password, String name, String sex, int age, String idcard, int phone) {
        this.username = username;
        this.password = password;
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.idcard = idcard;
        this.phone = phone;
    }

    public Admin(String username, String password) {
        this.username = username;
        this.password = password;
    }
}
