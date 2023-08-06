package com.zretc.pojo;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data //Getter Setter ToString
@AllArgsConstructor  //全参构造方法
@NoArgsConstructor   //无参构造方法
public class Gwc {
    @TableId
    private int gid;
    private String gname;
    private double gprice;
    private String gnum;
    private String gcreatetime;
    private String guser;

    public Gwc(String gname, double gprice, String gnum, String gcreatetime, String guser) {
        this.gname = gname;
        this.gprice = gprice;
        this.gnum = gnum;
        this.gcreatetime = gcreatetime;
        this.guser = guser;
    }
}
