package cn.iocoder.doraemon.itemgroup.item.entity;

import java.util.Date;

/**
 * Item SKU 规格值引用。用于和店铺关联，不同店铺有不同的规格值引用数据。
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
