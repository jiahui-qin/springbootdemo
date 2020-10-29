package com.example.springboot.controller;

import com.example.springboot.entity.User;
import com.example.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/testBoot")
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("getUser/{id}")

    public String GetUser(@PathVariable int id){
        System.out.println(id);
        return userService.Sel(id).toString();
    }
}
