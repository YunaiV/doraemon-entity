package cn.iocoder.doraemon.itemgroup.item;

import java.util.Date;

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
