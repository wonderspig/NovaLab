package com.hxshop.controller;

import com.hxshop.common.pojo.EUDataGridResult;
import com.hxshop.common.pojo.GoBuyResult;
import com.hxshop.pojo.Item;
import com.hxshop.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class ItemController {

    @Autowired
    private ItemService itemService;

    /**
     * 使用一个pojo对象来接受表单的内容，调用Service，请求参数名和POJO属性名进行自动匹配
     * @param item
     * @param desc
     * @param itemParams
     * @return
     */
    @RequestMapping(value = "/item/save",method = RequestMethod.POST)
    @ResponseBody
    public GoBuyResult addItem(Item item,String desc,String itemParams){
        return itemService.addItem(item,desc,itemParams);
    }

    @RequestMapping(value = "/item/list",method = RequestMethod.GET)
    @ResponseBody
    public EUDataGridResult listItem(int page, int rows){
        return itemService.getItemList(page,rows);
    }


}
