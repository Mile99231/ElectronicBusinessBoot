package com.zretc.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/*
* 用户实体类 (登录)
* */
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


    private String avatarUrl;

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUpwd() {
        return upwd;
    }

    public void setUpwd(String upwd) {
        this.upwd = upwd;
    }

    public int getUphone() {
        return uphone;
    }

    public void setUphone(int uphone) {
        this.uphone = uphone;
    }

    public String getUlasttime() {
        return ulasttime;
    }

    public void setUlasttime(String ulasttime) {
        this.ulasttime = ulasttime;
    }

    public User() {
    }

    public User(int id, String uname, String upwd, int uphone, String ulasttime) {
        this.id = id;
        this.uname = uname;
        this.upwd = upwd;
        this.uphone = uphone;
        this.ulasttime = ulasttime;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", uname='" + uname + '\'' +
                ", upwd='" + upwd + '\'' +
                ", uphone=" + uphone +
                ", ulasttime='" + ulasttime + '\'' +
                '}';
    }

    public User(String uname, String upwd, int uphone, String ulasttime, String avatarUrl) {
        this.uname = uname;
        this.upwd = upwd;
        this.uphone = uphone;
        this.ulasttime = ulasttime;
        this.avatarUrl = avatarUrl;
    }
}
