package com.example.springboot.entity;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "author")
public class author {
    private String name;
    private String baiduurl;

    public String getname(){
        return name;
    }
    public void setname(String name){
        this.name = name;
    }

    public String getbaiduurl(){
        return baiduurl;
    }

    public void setbaiduurl(String baiduurl){
        this.baiduurl = baiduurl;
    }
}
