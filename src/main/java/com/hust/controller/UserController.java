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
 * 登录
 * 注册
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

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    /**
     * 登录处理
     *
     * @return
     */
    @PostMapping("/login")
    public String login(@ModelAttribute(value = "user") User user, Model model) {
//        System.out.println(user);
        User user1 = userService.queryUserByUnameAndPwd(user.getUsername(), user.getPassword());
//        System.out.println("test ==> " + user1);
        if (user1 == null) {
            model.addAttribute("msg", "用户名或密码不正确");
            return "login";
        }
        return "index";
    }

    @GetMapping("/register")
    public String register() {
        return "register";
    }

    @PostMapping("/register")
    public String register(@ModelAttribute(value = "re_user") User user, Model model) {
        System.out.println(user);
        // 查询邮箱或者用户名是否已经被注册
        if (userService.queryUserByEmail(user.getEmail()) != null ||
                userService.queryUserByUname(user.getUsername()) != null) {
            model.addAttribute("re_msg", "邮箱或用户名重复");
            return "register";
        }
        int res = userService.addOneUser(user.getEmail(), user.getUsername(), user.getPassword());
        if (res > 0) {
            model.addAttribute("re_msg", "注册成功");
        } else {
            model.addAttribute("re_msg", "注册失败");
        }
        return "register";
    }

}
