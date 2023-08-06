package com.zretc.pojo;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/*
* 商品信息实体类
* */
@Data //Getter Setter ToString
@AllArgsConstructor  //全参构造方法
@NoArgsConstructor   //无参构造方法
public class Product {
    /*
     * 序号
     * */
    @TableId
    private int proid;
    /*
     * 商品编号
     * */

    private int pid;
    /*
     * 商品类别
     * */
    private int typeid;
    /*
     * 商品名称
     * */
    private String pname;
    /*
     * 商品图片
     * */
    private String pmainimage;
    /*
     * 商品描述
     * */
    private String pdecription;
    /*
     * 商品价格
     * */
    private double price;
    /*
     * 库存数量
     * */
    private Integer pstock;
    /*
     * 商品状态(1-在售 2-无货 3-下架)
     * */
    private Integer status;
    /*
     * 创建时间
     * */
    private String createtime;
    /*
     * 更新时间
     * */
    private String updatetime;
}
