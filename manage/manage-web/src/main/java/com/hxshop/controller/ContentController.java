package com.hxshop.controller;

import com.hxshop.common.pojo.GoBuyResult;
import com.hxshop.pojo.Content;
import com.hxshop.service.ContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/content")
public class ContentController {

    @Autowired
    private ContentService contentService;

    @RequestMapping("/save")
    @ResponseBody
    public GoBuyResult insertContent(Content content){
        return contentService.insertContent(content);
    }

}
