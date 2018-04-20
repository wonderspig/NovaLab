package com.hxshop.service;

import com.hxshop.common.pojo.EUTreeNode;
import com.hxshop.common.pojo.GoBuyResult;

import java.util.List;

public interface ContentCategoryService {

    List<EUTreeNode> getContentCategoryList(long parentId);

    GoBuyResult insertContentCategory(long parentId, String name);

}
