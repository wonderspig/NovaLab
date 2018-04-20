package com.hxshop.controller;

import com.hxshop.common.pojo.EUTreeNode;
import com.hxshop.common.pojo.GoBuyResult;
import com.hxshop.common.util.JsonUtils;
import com.hxshop.service.ContentCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by ldb on 2017/5/11.
 */
@Controller
@RequestMapping("/content/category")
public class ContentCategoryController {

    @Autowired
    private ContentCategoryService contentCateGoryService;

    @RequestMapping("/list")
    @ResponseBody   //<!--返回一个json文件，因此需要reponsebody注解-->
    private String getContentCategoryList(@RequestParam(value = "id",defaultValue = "0") long parentId){
        List<EUTreeNode> contentCategoryList = contentCateGoryService.getContentCategoryList(parentId);
        return JsonUtils.objectToJson(contentCategoryList);
    }

    @RequestMapping("/create")
    @ResponseBody
    private GoBuyResult insertContentCategory(long parentId,String name){
        return contentCateGoryService.insertContentCategory(parentId,name);
    }



}
