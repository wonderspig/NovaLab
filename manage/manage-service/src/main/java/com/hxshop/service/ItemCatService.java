package com.hxshop.service;

import com.hxshop.common.pojo.EUTreeNode;


import java.util.List;

/**
 * 主要是为添加商品时，返回商品分类列表
 */
public interface ItemCatService {

    List<EUTreeNode> getItemCatList(Long parentId) throws Exception;
}
