package com.zretc.controller;

import com.github.pagehelper.PageInfo;
import com.zretc.pojo.Product;
import com.zretc.service.MileProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("product")
public class MileProductController {
    @Autowired
    private MileProductService mileProductService;

//查询全部商品信息
    @RequestMapping("all.action")
    public List<Product> all(){
        return mileProductService.Shop();
    }
//根据id查询
    @RequestMapping("selById.action")
    public List<Product> sel(String title){
        return mileProductService.selByName(title);
    }
    //分页查询
    @RequestMapping("page.action")
    public Map<String,Object> pages(int currpage,int size){
        Map<String,Object> maps = new HashMap<>();
        PageInfo<Product> pages = mileProductService.pages(currpage,size);
        maps.put("data",pages.getList());
        maps.put("pages",pages.getPages());
        maps.put("size",pages.getTotal());

        return maps;
    }

}
