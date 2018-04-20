package com.hxshop.service.impl;

import com.hxshop.common.util.JsonUtils;
import com.hxshop.mapper.ItemParamItemMapper;
import com.hxshop.pojo.ItemParamItem;
import com.hxshop.service.ItemParamItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;
import java.util.Map;

@Service
public class ItemParamItemServiceImpl implements ItemParamItemService {
    @Autowired
    private ItemParamItemMapper itemParamItemMapper;

    /**
     * 显示商品的规格参数
     * @param ItemId
     * @return
     */
    @Override
    public String getItemParamByItemId(long ItemId) {
        ItemParamItem example=new ItemParamItem();
        //根据id查询
        example.setItem_id(ItemId);
        List<ItemParamItem> itemParamItems=itemParamItemMapper.select(example);
        if (itemParamItems==null||itemParamItems.size()==0) {
            return null;
        }
        //规格参数
        ItemParamItem itemParamItem=itemParamItems.get(0);
        String paramData=itemParamItem.getParam_data();
        //生成html
        //将表格参数json数据转换成java对象
        List<Map> jsonList=JsonUtils.jsonToList(paramData, Map.class);
        StringBuffer sb=new StringBuffer();
        sb.append("<table cellpadding=\"0\" cellspacing=\"1\" width=\"100%\" border=\"1\" class=\"Ptable\">\n" );
        sb.append("  <tbody>\n" );
        for(Map m1: jsonList)
        {
            sb.append("    <tr>\n" );
            sb.append("	    <th class=\"tdTitle\" colspan=\"2\">"+m1.get("group")+"</th>\n");
            sb.append("	</tr>\n");

            List<Map> list2= (List<Map>) m1.get("params");
            for (Map m2:list2)
            {
                sb.append("	<tr>\n" );
                sb.append("	    <th class=\"tdTitle\" >"+m2.get("k")+"</th>\n");
                sb.append("		<td>"+m2.get("v")+"</td>\n" );
                sb.append("	</tr>\n" );
            }
        }
        sb.append("	</tbody>\n" );
        sb.append("<table>");

        return sb.toString();
    }
}
