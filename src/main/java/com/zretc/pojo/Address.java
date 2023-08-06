package com.zretc.pojo;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data //Getter Setter ToString
@AllArgsConstructor  //全参构造方法
@NoArgsConstructor   //无参构造方法
public class Address {
    @TableId
    private int id;
    private String name;
    private String sex;
    private String phone;
    private String addrss;
    private String user;

    public Address(String name, String sex, String phone, String addrss,String user) {
        this.name = name;
        this.sex = sex;
        this.phone = phone;
        this.addrss = addrss;
        this.user = user;
    }

}
