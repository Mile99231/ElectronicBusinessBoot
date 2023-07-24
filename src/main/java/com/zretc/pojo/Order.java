package com.zretc.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data //Getter Setter ToString
@AllArgsConstructor  //全参构造方法
@NoArgsConstructor   //无参构造方法
public class Order {

//    id
    private int id;

//    订单号
    private String did;

//    商品名称
    private String dname;

//     商品ID
    private int proid;


//    商品价格
    private double dprice;

//    购买数量
    private int dsum;

//    购买时间
    private String dtime;

//    用户名称
    private String duser;

    private Product product;

    public Order(String did, String dname, int proid, double dprice, int dsum, String dtime, String duser) {
        this.did = did;
        this.dname = dname;
        this.proid = proid;
        this.dprice = dprice;
        this.dsum = dsum;
        this.dtime = dtime;
        this.duser = duser;
    }

    public Order(String did, String dname, int proid, double dprice, int dsum, String dtime, String duser, Product product) {
        this.did = did;
        this.dname = dname;
        this.proid = proid;
        this.dprice = dprice;
        this.dsum = dsum;
        this.dtime = dtime;
        this.duser = duser;
        this.product = product;
    }
}
