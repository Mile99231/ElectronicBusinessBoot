package com.zretc.controller;


import com.github.pagehelper.PageInfo;
import com.zretc.pojo.Admin;
import com.zretc.pojo.Business;
import com.zretc.pojo.User;
import com.zretc.service.AdminService;
import com.zretc.util.RandomValidateCodeUtil;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.DigestUtils;
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
//    @Autowired
//    private static Logger logger;

    /**
    * 查询所有管理员信息
    */
    @RequestMapping("SelAdmin.action")
    public List<Admin> SelAdmin(){

       return adminService.SelAdmin();
    }
    /**
     * 管理员登录
     */
    @RequestMapping("login.action")
    public Map<String,Object> login(Admin admin){

        admin.setPassword(DigestUtils.md5DigestAsHex((admin.getUsername()+"{"+admin.getPassword()+"}").getBytes()));

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

    /**
     * 删除管理员信息
     */
    @RequestMapping("DelAdmin.action")
    public Map<String,Object> DelAdmin(int bid){
        Map<String,Object> maps=new HashMap<>();
        if (adminService.DelAdmin(bid)){
            maps.put("errorcode",0);
        }else {
            maps.put("errorcode",101);
        }
        return maps;
    }

    /**
     * 修改管理员信息
     */
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
    /**
     * 添加管理员信息
     */
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
     * 修改管理员密码
     */
    @RequestMapping("UpdAdminPwd.action")

    public Map<String,Object> UpdAdminPwd( Admin admin){
        Map<String,Object> maps=new HashMap<>();

        admin.setPassword(DigestUtils.md5DigestAsHex((admin.getUsername()+"{"+admin.getPassword()+"}").getBytes()));

        boolean flag = adminService.UpdAdminPwd(admin);
        if (flag){
            maps.put("errorcode",0);
        }else {
            maps.put("errorcode",101);
        }
        return maps;
    }



    /**
    * 查询所有商家信息
    *
    */
    @RequestMapping("SelBusiness.action")
    public Map<String,Object> SelBusiness(int currpage,int size){
        Map<String,Object> maps=new HashMap<>();

        PageInfo<Business> pages = adminService.SelBusiness(currpage,size);
        maps.put("data",pages.getList());
        maps.put("pages",pages.getPages());
        maps.put("size",pages.getTotal());
        return maps;
    }

    /**
     * 删除商家信息
     */
    @RequestMapping("DelBusiness.action")
    public Map<String,Object> DelBusiness(int id){
        Map<String,Object> maps=new HashMap<>();
        if (adminService.DelBusiness(id)){
            maps.put("errorcode",0);
        }else {
            maps.put("errorcode",101);
        }
        return maps;
    }

    /**
     * 修改商家信息
     */
    @RequestMapping("UpdBusiness.action")
    public Map<String,Object> UpdBusiness(@RequestBody Business business){
        Map<String,Object> maps=new HashMap<>();

        boolean flag = adminService.UpdBusiness(business);
        if (flag){
            maps.put("errorcode",0);
        }else {
            maps.put("errorcode",101);
        }
        return maps;
    }
    /**
     * 查询商品信息
     */
    @RequestMapping("selBusPro.action")
    public Map<String,Object> busProd(int currpage,int size){
        Map<String,Object> maps=new HashMap<>();

        PageInfo<Business> pages = adminService.busProd(currpage,size);
        maps.put("data",pages.getList());
        maps.put("pages",pages.getPages());
        maps.put("size",pages.getTotal());
        return maps;
    }
    /**
     * 查询用户信息
     */
    @RequestMapping("SelUser.action")
    public Map<String,Object> SelUser(int currpage,int size){
        Map<String,Object> maps=new HashMap<>();

        PageInfo<User> pages = adminService.SelUser(currpage,size);
        maps.put("data",pages.getList());
        maps.put("pages",pages.getPages());
        maps.put("size",pages.getTotal());
        return maps;
    }

    /**
     * 修改用户信息
     */
    @RequestMapping("UpdUser.action")
    public Map<String,Object> UpdUser(@RequestBody User user){
        System.out.println(user);
        Map<String,Object> maps = new HashMap<>();

        boolean flag = adminService.UpdUser(user);

        if (flag){
            maps.put("errorcode",0);
        }else{
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
     * 校验验证码
     */
    @RequestMapping(value = "/checkVerify", method = RequestMethod.POST, headers = "Accept=application/json")
    public boolean checkVerify(@RequestBody Map<String, Object> requestMap, HttpSession session) {
//        System.out.println(requestMap);
//        System.out.println(session.getId());
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
