package com.example.springboot.mapper;


import com.example.springboot.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
    User Sel(int id);
    User login(String userName,String passWord);

    int register(User user);
}
