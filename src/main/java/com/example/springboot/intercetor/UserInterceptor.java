package com.example.springboot.intercetor;

import com.example.springboot.entity.User;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class UserInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws IOException {
        System.out.println("now in prehandle");
        System.out.println(handler);
        User user = (User) request.getSession().getAttribute("session_user");
        if (user==null){
            response.sendRedirect(request.getContextPath()+"/user/toIndex");
            System.out.println("拦截成功并跳转");
        }
        System.out.println("不需要拦截已放行");
        return true;
    }
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView){
        System.out.println("执行了postHandle方法");
    }
    @Override
    public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3) throws Exception {
        System.out.println("执行到了afterCompletion方法");
    }
}
