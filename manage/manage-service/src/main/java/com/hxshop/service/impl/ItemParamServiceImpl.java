package com.hxshop.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hxshop.common.pojo.EUDataGridResult;
import com.hxshop.common.pojo.GoBuyResult;
import com.hxshop.mapper.ItemCatMapper;
import com.hxshop.mapper.ItemParamMapper;
import com.hxshop.pojo.ItemCat;
import com.hxshop.pojo.ItemParam;
import com.hxshop.service.ItemParamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * Created by ldb on 2017/5/9.
 */
@Service
public class ItemParamServiceImpl implements ItemParamService {

    @Autowired
    private ItemParamMapper itemParamMapper;

    @Autowired
    private ItemCatMapper itemCatMapper;

    @Override
    public GoBuyResult getItemParamByCId(long cid) {
        ItemParam itemParam=new ItemParam();
        itemParam.setItem_cat_id(cid);
        List<ItemParam> itemParamList = itemParamMapper.select(itemParam);
        if(itemParamList!=null && itemParamList.size()>0){
            return GoBuyResult.ok(itemParamList.get(0));
        }
        return GoBuyResult.ok();
    }

    @Override
    public GoBuyResult insertItemParam(ItemParam itemParam) {
        itemParam.setCreated(new Date());
        itemParam.setUpdated(new Date());
        int resultNum = itemParamMapper.insert(itemParam);
        if(resultNum>0){
            return GoBuyResult.ok();
        }
        return null;
    }

    @Override
    public EUDataGridResult getItemParamList(int page, int rows) {
        EUDataGridResult result=new EUDataGridResult();
        //获取分页列表
        PageHelper.startPage(page,rows);
        List<ItemParam> itemParamList = itemParamMapper.selectAll();
        //获取总记录数
        PageInfo pageInfo =new PageInfo(itemParamList);
        long total = pageInfo.getTotal();

        //设置ItemCatName
        for (ItemParam itemParam : itemParamList) {
            ItemCat itemCat = itemCatMapper.selectByPrimaryKey(itemParam.getId());
            itemParam.setItem_cat_name(itemCat.getName());
        }
        result.setTotal(total);
        result.setRows(itemParamList);
        return result;
    }
}
