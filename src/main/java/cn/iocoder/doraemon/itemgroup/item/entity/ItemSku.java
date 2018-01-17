package cn.iocoder.doraemon.itemgroup.item.entity;

import java.util.Date;

public class ItemSku {

    /**
     * sku 编号
     */
    private Integer id;
    /**
     * 商品编号
     */
    private Integer itemId;
    /**
     * 店铺编号
     */
    private Integer shopId;
    /**
     * 唯一编码，店铺Id 和 商品skuId 组合
     * <p>
     * // TODO 芋艿，具体用途是什么。拼接方式，shopId + skuId
     */
    private String uniqueCode;
    /**
     * 标题
     */
    private String title;
    /**
     * 图片地址
     */
    private String imageURL;
    /**
     * 商品规格
     * // TODO 芋艿，和文科沟通下，mysql 是怎么存储的
     * <p>
     * JSON 格式，[{
     * kid: // 规格名编号 {@link ItemSkuProperty#id}
     * k: // 规格名文本 {@link ItemSkuProperty#name}
     * vid: // 规格值编号 {@link ItemSkuProperty#id}
     * v: // 规格值文本 {@link ItemSkuProperty#name}
     * }]
     * <p>
     * 例如  [ { "kid": "20000", "vid": "3275069", "k": "品牌", "v": "盈讯" }, { "kid": "1753146", "vid": "3485013", "k": "型号", "v": "F908" }
     */
    private String properties;
    /**
     * 价格，单位分
     */
    private Integer price;
    /**
     * 属于这个Sku的商品的数量
     */
    private Integer quantity;
    /**
     * 商品在付款减库存的状态下，该Sku上未付款的订单数量
     */
    private Integer withHoldQuantity;
    /**
     * 总销量
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