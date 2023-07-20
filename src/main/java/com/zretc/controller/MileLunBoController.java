package com.zretc.controller;

import com.zretc.pojo.Lunbo;
import com.zretc.service.MileLunBoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("lunbo")
public class MileLunBoController {
    @Autowired
    private MileLunBoService mileLunBoService;
    @RequestMapping("a")
    public List<Lunbo> sellunbo(){
        return mileLunBoService.lunbo();

    }


}
