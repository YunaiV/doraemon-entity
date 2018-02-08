package cn.iocoder.doraemon.itemgroup.snapshot.entity;

import java.util.Date;

/**
 * 商品 SKU 快照，对应 {@link cn.iocoder.doraemon.itemgroup.item.entity.ItemSku} 实体
 */
public class ItemSkuSnapshot {

    /**
     * 商品快照编号 {@link ItemSnapshot#id}
     */
    private Integer snapshotId;
    private String uniqueCode;
    private Integer skuId;
    private Integer itemId;
    private Integer shopId;

//    private Integer status; // 无需状态，因为 sku 变更后，会产生新的 ItemSnapshot

    private String imageURL;
    private String properties;
    private Integer price;
    private String itemNo;
    /**
     * 库存数量
     *
     *【不影响 {@link ItemSnapshot#id}】的计算
     */
    private Integer quantity;
    /**
     * 商品在付款减库存的状态下，该Sku上未付款的订单数量
     *
     * 【不影响 {@link ItemSnapshot#id}】的计算
     */
    private Integer withHoldQuantity;
    /**
     * 销量
     *
     * 【不影响 {@link ItemSnapshot#id}】的计算
     */
    private Integer soldNum;
    /**
     * 快照时间
     */
    private Date createTime;

}
