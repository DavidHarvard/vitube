package com.example.vidtube.controller;

import com.example.vidtube.pojo.User;
import com.example.vidtube.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController()
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping ("/test")
    public String test(@RequestBody  User user){
        User testUser = new User();
        return userService.saveData(user);
    }
}
