package com.hxshop.controller;

import com.hxshop.common.util.JsonUtils;
import com.hxshop.service.PictureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.util.Map;

@Controller
public class PictureController {

    @Autowired
    private PictureService pictureService;

    @RequestMapping("/pic/load")
    @ResponseBody
    public String uploadPicture(MultipartFile file)
    {
        Map map = pictureService.uploadPicture(file);
        String json = JsonUtils.objectToJson(map);
        return json;
    }
}
