package com.hxshop.common.pojo;

/**
 * 接受parentid参数，根据parentid查询子类别，返回一个分类列表，可以创建
 * 一个pojo来描述一个节点格式，最终返回一个pojo列表。
 * 因为是共有的，所以应该放在common中
 */

/**
 *  在商品条目选择时候，因为使用了easyUI的异步tree。因此按照需求，需要id，节点状态，节点名称。
 * 其中树控件内建异步加载模式的支持，用户先创建一个空的树，然后指定一个服务器端，执行检索后动态返回JSON数据来填充树并完成异步请求
 */
public class EUTreeNode {
    //要和数据库中白痴
    private Long id;
    private String text;
    private String state;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
