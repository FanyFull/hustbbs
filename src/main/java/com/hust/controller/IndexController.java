package com.hust.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 配置项目的根路径的页面
 */

@Controller
public class IndexController {

    @RequestMapping("/")
    public String indexPage() {
        return "login";
    }

}
