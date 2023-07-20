package com.zretc.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

//gao su springboot zhe shi yi ge pei zhi lei
@Configuration
public class WebConfig implements WebMvcConfigurer {

//chong xie yi ge fang fa
    @Override
    public void addCorsMappings(CorsRegistry registry){
//        设置允许跨域的请求
        String mapping="/**";//项目中的所有接口都支持跨域，也可以配置特定的请求入/admin/**
        String origins="*";//设置所有来源 允许设置的请求域名访问我的跨域资源,也可以配置特定的来源允许跨域
        String methods="*";//设置允许的请求方法 get post options delete .....

        registry.addMapping(mapping).allowedOrigins(origins).allowedMethods(methods);
    }
}
