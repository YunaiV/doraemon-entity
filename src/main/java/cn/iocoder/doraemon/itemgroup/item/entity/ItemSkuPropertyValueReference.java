package cn.iocoder.doraemon.itemgroup.item.entity;

import java.util.Date;

/**
 * Item SKU 规格值引用。用于和店铺关联，不同店铺有不同的规格值引用数据。
 */
public class ItemSkuPropertyValueReference {

    /**
     * 编号
     */
    private Integer id;
    /**
     * 店铺编号
     */
    private Integer shopId;
    /**
     * 关联编号
     *
     * {@link ItemSkuPropertyKeyReference#id}
     */
    private Integer referenceId;
    /**
     * 属性键编号
     *
     * {@link ItemSkuProperty#id}
     */
    private Integer keyId;
    /**
     * 属性值编号
     *
     * {@link ItemSkuProperty#id}
     */
    private Integer valueId;
    /**
     * 添加时间
     */
    private Date addTime;

}
