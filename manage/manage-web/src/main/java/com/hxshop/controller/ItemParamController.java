package com.hxshop.controller;

import com.hxshop.common.pojo.EUDataGridResult;
import com.hxshop.common.pojo.GoBuyResult;
import com.hxshop.pojo.ItemParam;
import com.hxshop.service.ItemParamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 页面吧所有文本框的中的内容生成json，吧json字符串提交给狗太，保存到规格参数表中。，具体见item-param-add.jsp
 */

@Controller
@RequestMapping("/item/param")
public class ItemParamController {

    @Autowired
    private ItemParamService itemParamService;

    @RequestMapping("/query/itemcatid/{cid}")
    @ResponseBody
    public GoBuyResult getItemParamByCId(@PathVariable long cid){
        return itemParamService.getItemParamByCId(cid);
    }

    @RequestMapping("/save/{cid}")
    @ResponseBody
    public GoBuyResult insertItemParam(@PathVariable long cid,String paramData){
        ItemParam itemParam=new ItemParam();
        itemParam.setItem_cat_id(cid);
        itemParam.setParam_data(paramData);
        return  itemParamService.insertItemParam(itemParam);
    }

    @RequestMapping("/list")
    @ResponseBody
    public EUDataGridResult getItemParamList(int page, int rows){
        return itemParamService.getItemParamList(page,rows);
    }



}
