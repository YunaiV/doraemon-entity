package cn.iocoder.doraemon.itemgroup.item.entity;

import java.util.Date;

public class ItemSkuPropertyKeyReference {

    /**
     * 编号
     */
    private Integer id;
    /**
     * 店铺编号
     */
    private Integer shopId;
    /**
     * 属性键编号
     *
     * {@link ItemSkuProperty#id}
     */
    private Integer keyId;
    /**
     * 添加时间
     */
    private Date addTime;
}
