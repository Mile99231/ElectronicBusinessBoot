package com.zretc.controller;

import com.zretc.pojo.User;
import com.zretc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.system.ApplicationHome;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@RestController
@RequestMapping("userFile")
public class MileFileController {
    @Autowired
    private UserService userService;

    @RequestMapping("upload.action")
    public String upload(User user, MultipartFile file){//1获取文件
        if (file.isEmpty()){
            return "文件获取失败";
        }
        //2-修改文件名称
        String originalFilename = file.getOriginalFilename();//elice.jpg
        String prefixName = "."+originalFilename.split("\\.")[1];//.jpg
        String fileName = user.getUname() + prefixName; // 使用用户名作为文件名
//        String uuid= UUID.randomUUID().toString().replace("-","");
//        String fileName = uuid+prefixName;//使用uuid作为文件名
        //3-上传文件 ,本地文件 报错到网络环境(tomcat服务器)
        //3-1 保存目录
        //目录获取第一种方式：获取编译后的target路径保存图片
        String path = null;
        try {
            path = ResourceUtils.getURL("classpath:").getPath()+"static\\images\\";
        }catch (Exception e){
            e.printStackTrace();
        }
//        目录获取第二种方式 获取src路径保存图片
//        ApplicationHome applicationHome = new ApplicationHome(this.getClass());
//        String path = applicationHome.getDir().getParentFile().getParentFile().getAbsolutePath()+"\\src\\main\\resources\\static\\images\\";
        //3-2文件完成路径
        String filePath = path+fileName;
        //判断存储的目录是否存在，如果不存在则创建文件夹
        File dir = new File(filePath);
        if (!dir.exists()){
            dir.mkdirs();
        }
        //3-3上传
        try {
            System.out.println("文件保存的路径："+dir);
            file.transferTo(dir);
        }catch (Exception e){
            e.printStackTrace();
        }
//        if (file.isEmpty()){
//            maps.put("errorcode","1");
//        }
//        return maps;
        user.setAvatarUrl(fileName);
        userService.edit(user);
return filePath;
    }
}
