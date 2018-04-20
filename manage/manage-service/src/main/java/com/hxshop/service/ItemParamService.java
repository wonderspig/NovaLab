package com.hxshop.service;

import com.hxshop.common.pojo.EUDataGridResult;
import com.hxshop.common.pojo.GoBuyResult;
import com.hxshop.pojo.ItemParam;

/**
 * Created by ldb on 2017/5/9.
 */
public interface ItemParamService {

    GoBuyResult getItemParamByCId(long cid);

    /**
     * 这个是商品规格时候用到的
     * @param itemParam
     * @return
     */
    GoBuyResult insertItemParam(ItemParam itemParam);

    EUDataGridResult getItemParamList(int page, int rows);
}
