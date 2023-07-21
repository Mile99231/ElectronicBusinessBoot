package com.zretc.controller;

import com.zretc.pojo.Product;
import com.zretc.service.MileProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("product")
public class MileProductController {
    @Autowired
    private MileProductService mileProductService;


    @ResponseBody
    @RequestMapping("all.action")
    public List<Product> all(){
        return mileProductService.Shop();
    }

    @ResponseBody
    @RequestMapping("selById.action")
    public List<Product> sel(String title){
        return mileProductService.selByName(title);
    }
}
