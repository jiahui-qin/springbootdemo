package com.example.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("/Hello")
    public String hello(){
        return author.getname() + " baidu url is " + author.getbaiduurl();
    }
    //@Value("${name}")
    //private String name;

    //@Value("${baiduurl}")
    //private String baiduurl;
    @Autowired
    private com.example.springboot.entity.author author;

}
