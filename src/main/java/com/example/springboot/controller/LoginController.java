package com.example.springboot.controller;

import com.example.springboot.entity.User;
import com.example.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
@RequestMapping("/user")
public class LoginController {
    @Autowired
    private UserService userService;

    @RequestMapping("/toIndex")
    public String show(){
        return "index";
    }

    @RequestMapping("/loginUser")
    public String login(User user, HttpServletRequest request){
        String userName = user.getUserName();
        String passWord = user.getPassWord();
        User u1 = userService.login(userName, passWord);
        if (u1 ==null){
            return "ERROR PASSWORD";
        }else{
            request.getSession().setAttribute("serrsion_user",user);
            return "welcome";
        }
    }

    @RequestMapping("/toRegister")
    public String toRegister(){
        return "register";
    }

    @RequestMapping("/register")
    public String register(User user){
        int su = userService.register(user);
        if  (su==0){
            System.out.println("---");
        }
        return "welcome";
    }
    @RequestMapping("/welcome")
    public String welcome(){
        return "welcome";
    }

    //退出登录
    @RequestMapping("/outUser")
    public void outUser(HttpServletRequest request, HttpServletResponse response) throws IOException {
        request.getSession().removeAttribute("session_user");
        response.sendRedirect("/user/toIndex");
    }


}
