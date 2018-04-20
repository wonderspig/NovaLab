package com.hxshop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
//页面跳转
@Controller
public class PageController {

    /**
     * 打开首页
     * @return
     */
    @RequestMapping("/")
    public String showIndex(){
        return "index";

    }

    /**
     * 展示其他页面
     * @param page
     * @return
     */
    @RequestMapping("/{page}")
    public String showPage(@PathVariable String page){
        return page;
    }

}
