package com.example.vidtube.service;

import com.example.vidtube.mapper.UserMapper;
import com.example.vidtube.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserService {

    @Resource
    private UserMapper userMapper;


    public String saveData(User user){

        userMapper.insert(user);
        return "successful";
    }
}
