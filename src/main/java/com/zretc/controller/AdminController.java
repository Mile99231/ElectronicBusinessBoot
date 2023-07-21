package com.zretc.controller;


import com.zretc.pojo.Admin;
import com.zretc.service.AdminService;
import com.zretc.util.RandomValidateCodeUtil;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("admin")

public class AdminController {
    @Autowired
    private AdminService adminService;
//    private static Logger logger;

    @RequestMapping("SelAdmin.action")
    public List<Admin> SelAdmin(){

       return adminService.SelAdmin();
    }

    @RequestMapping("login.action")
    public Map<String,Object> login(Admin admin){

        Map<String,Object> maps=new HashMap<>();
        Admin a = adminService.login(admin.getUsername(), admin.getPassword());
        if(a!=null){
            maps.put("errorcode",0);
            maps.put("result",a);
        }else{
            maps.put("errorcode",101);
            maps.put("result",null);
        }

        return maps;
    }
    @RequestMapping("DelAdmin.action")
    public Map<String,Object> DelAdmin(int id){
        Map<String,Object> maps=new HashMap<>();
        if (adminService.DelAdmin(id)){
            maps.put("errorcode",0);
        }else {
            maps.put("errorcode",101);
        }
        return maps;
    }
    @RequestMapping("UpdAdmin.action")

    public Map<String,Object> UpdAdmin(@RequestBody Admin admin){
        Map<String,Object> maps=new HashMap<>();

        boolean flag = adminService.UpdAdmin(admin);
        if (flag){
            maps.put("errorcode",0);
        }else {
            maps.put("errorcode",101);
        }
        return maps;
    }

    @RequestMapping("AddAdmin.action")

    public Map<String,Object> AddAdmin(@RequestBody Admin admin){
        Map<String,Object> maps=new HashMap<>();

        boolean flag = adminService.AddAdmin(admin);
        if (flag){
            maps.put("errorcode",0);
        }else {
            maps.put("errorcode",101);
        }
        return maps;
    }

    /**
     * 生成验证码
     */
    @RequestMapping(value = "/getVerify")
    public void getVerify(HttpServletRequest request, HttpServletResponse response) {
        try {
            response.setContentType("image/jpeg");//设置相应类型,告诉浏览器输出的内容为图片
            response.setHeader("Pragma", "No-cache");//设置响应头信息，告诉浏览器不要缓存此内容
            response.setHeader("Cache-Control", "no-cache");
            response.setDateHeader("Expire", 0);
            RandomValidateCodeUtil randomValidateCode = new RandomValidateCodeUtil();
            randomValidateCode.getRandcode(request, response);//输出验证码图片方法
        } catch (Exception e) {
//            logger.error("获取验证码失败>>>>   ", e);
        }
    }

    /**
     * 忘记密码页面校验验证码
     */
    @RequestMapping(value = "/checkVerify", method = RequestMethod.POST, headers = "Accept=application/json")
    public boolean checkVerify(@RequestBody Map<String, Object> requestMap, HttpSession session) {
        System.out.println(requestMap);
        System.out.println(session.getId());
//        69F36B37593B4617DC64FE0135729266
//        4FDC169CFB600C09E07CBB1697F8E9BC
        try{
            //从session中获取随机数
            String inputStr = requestMap.get("params").toString();
            String random = (String) session.getAttribute("RANDOMVALIDATECODEKEY");
            System.out.println(inputStr);
            System.out.println(random);
            if (random == null) {
                return false;
            }
            if (random.equals(inputStr)) {
                return true;
            } else {
                return false;
            }
        }catch (Exception e){
//            logger.error("验证码校验失败", e);
            return false;
        }
    }



}
