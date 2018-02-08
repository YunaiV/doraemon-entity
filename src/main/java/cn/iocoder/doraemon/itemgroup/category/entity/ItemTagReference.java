package cn.iocoder.doraemon.itemgroup.category.entity;

import java.util.Date;

/**
 * Item 分组引用。一个商品可以有多个商品分组。
 */
public class ItemTagReference {

    /**
     * 店铺编号
     */
    private Integer shopId;
    /**
     * 商品编号
     */
    private Integer itemId;
    /**
     * 商品分组编号
     */
    private Integer tagId;
    /**
     * 状态
     *
     * 1-正常
     * 2-删除
     */
    private Integer status;
    /**
     * 添加时间
     */
    private Date addTime;

}
