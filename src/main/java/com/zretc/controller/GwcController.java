package com.zretc.controller;

import com.zretc.pojo.Gwc;
import com.zretc.service.GwcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequestMapping("gwc")
@Controller
public class GwcController {
    @Autowired
    private GwcService gwcService;

    @ResponseBody
    @RequestMapping("sel.action")
    public Map<String,Object> sel(String user){
        Map<String,Object> list = new HashMap<>();
        List<Gwc> sel = gwcService.sel(user);
        list.put("data",sel);
        list.put("errorcode",0);
        return list;
    }
    @ResponseBody
    @RequestMapping("add.action")
    public Map<String,Object> add(@RequestBody Gwc gwc){
        Map<String,Object> list = new HashMap<>();
        if (gwcService.add(gwc)){
            list.put("errorcode",0);
        }else {
            list.put("errorcode",101);
        }
        return list;
    }
    @ResponseBody
    @RequestMapping("del.action")
    public Map<String,Object> del(int gid){
        Map<String,Object> list = new HashMap<>();
        if (gwcService.del(gid)){
            list.put("errorcode",0);
        }else {
            list.put("errorcode",101);
        }
        return list;
    }
    @ResponseBody
    @RequestMapping("delByIds.action")
    public Map<String,Object> delByIds(@RequestBody List<Integer> ids){
        Map<String,Object> maps = new HashMap<>();
        if (gwcService.delByIds(ids)){
            maps.put("errorcode",0);
        }else {
            maps.put("errorcode",101);
        }
        return maps;
    }
}
