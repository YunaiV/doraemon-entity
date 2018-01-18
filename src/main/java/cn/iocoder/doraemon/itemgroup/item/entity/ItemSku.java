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
     * JSON 格式，[{
     *   kid: // 规格名编号 {@link ItemSkuProperty#id}
     *   k: // 规格名文本 {@link ItemSkuProperty#name}
     *   vid: // 规格值编号 {@link ItemSkuProperty#id}
     *   v: // 规格值文本 {@link ItemSkuProperty#name}
     * }]
     *
     * 例如  [ { "kid": "20000", "vid": "3275069", "k": "品牌", "v": "盈讯" }, { "kid": "1753146", "vid": "3485013", "k": "型号", "v": "F908" }
     */
    private String properties;
    /**
     * 价格，单位分
     */
    private Integer price;
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