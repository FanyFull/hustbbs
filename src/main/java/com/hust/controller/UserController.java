package com.hust.controller;

import com.hust.dao.UserMapper;
import com.hust.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserMapper userMapper;

    @GetMapping("/getUserLists")
    public List<User> getUserLists() {
        return userMapper.getUserLists();
    }

}
