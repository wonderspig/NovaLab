package com.hxshop.controller;

import com.hxshop.service.ItemParamItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 展示商品规格参数
 */
@Controller
public class ItemParamItemController {
    @Autowired
    private ItemParamItemService itemParamItemService;

    @RequestMapping("/showitem/{itemid}")
    public String showItemParam(@PathVariable Long itemid,Model model)
    {
        String string=itemParamItemService.getItemParamByItemId(itemid);
        model.addAttribute("itemParam",string);
        return "item";
    }
}
