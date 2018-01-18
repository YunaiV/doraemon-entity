package cn.iocoder.doraemon.itemgroup.item.entity;

import java.util.Date;

public class ItemSku {

    /**
     * 唯一编码，店铺Id 和 商品skuId 组合
     *
     * 分销场景下，skuId 多个店铺相同，uniqueCode 不同
     */
    private String uniqueCode;
    /**
     * sku 编号
     *
     * 非唯一
     */
    private Integer skuId;
    /**
     * 商品编号
     */
    private Integer itemId;
    /**
     * 店铺编号
     */
    private Integer shopId;
    /**
     * 状态
     *
     * 1-正常
     * 2-删除
     */
    private Integer status;
    /**
     * 图片地址
     */
    private String imageURL;
    /**
     * 商品规格
     *
     * 格式：kid[0]-vid[0],kid[1]-vid[1]...kid[n]-vid[n]
     * 例如：20000-3275069,1753146-3485013
     */
    private String properties;
    /**
     * 价格，单位分
     */
    private Integer price;
    /**
     * 商品货号（商家为商品设置的外部编号）
     */
    private String itemNo;
    /**
     * 库存数量
     */
    private Integer quantity;
    /**
     * 商品在付款减库存的状态下，该Sku上未付款的订单数量
     */
    private Integer withHoldQuantity;
    /**
     * 销量
     */
    private Integer soldNum;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 更新时间
     */
    private Date updateTime;

}