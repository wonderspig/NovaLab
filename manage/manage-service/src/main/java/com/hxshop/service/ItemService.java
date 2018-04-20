package com.hxshop.service;

import com.hxshop.common.pojo.EUDataGridResult;
import com.hxshop.common.pojo.GoBuyResult;
import com.hxshop.pojo.Item;



public interface ItemService {

    /**
     * 接受一个pojo对象，并对其进行不全，最终将数据插入至Item。pojo有现成的。
     * @param item
     * @param desc
     * @param itemParams
     * @return
     */
    GoBuyResult addItem(Item item, String desc, String itemParams);

    EUDataGridResult getItemList(int page, int rows);
}
