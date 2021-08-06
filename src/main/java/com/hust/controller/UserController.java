package com.hust.controller;

import com.hust.pojo.User;
import com.hust.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 控制用户的行为
 *   登录
 *   注册
 */

@Controller
public class UserController {

    private final UserService userService;

    // 这里使用构造器注入的方式
    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @ResponseBody
    @GetMapping("/getUserLists")
    public List<User> getUserLists() {
        List<User> userList = userService.getUserLists();
        System.out.println(userList);
        return userList;
    }

    /**
     * 登录处理
     * @return
     */
    @PostMapping("/login")
    public String login(@ModelAttribute(value = "user") User user, Model model) {
        System.out.println(user);

        User user1 = userService.queryUserByUnameAndPwd(user.getUsername(), user.getPassword());
        System.out.println("test ==> " + user1);
        return "index";
    }

    @RequestMapping("/register")
    public String register() {
        return "register";
    }

}
