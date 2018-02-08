package cn.iocoder.doraemon.itemgroup.snapshot.entity;

import java.util.Date;

/**
 * 商品快照，对应 {@link cn.iocoder.doraemon.itemgroup.item.entity.Item} 实体
 */
public class ItemSnapshot {

    /**
     * 快照编号
     */
    private String id;
    /**
     * 商品编号 {@link cn.iocoder.doraemon.itemgroup.item.entity.Item#id}
     */
    private Integer itemId;
    private String alias;
    /**
     * 是否当前商品正在使用的快照。
     */
    private Boolean isNewest;
    /**
     * 快照时间
     */
    private Date createTime;

    // ========== 基本信息 BEGIN ==========

    private String title;
    private String summary;
    private Integer cid;
    private String picURLs;
    private Integer itemType;
    private Integer goodsType;

    // ========== 基本信息 END ==========

    // ========== 价格库存 BEGIN ==========

    private Integer price;
    private Double itemWeight;
    private String itemNo;
    /**
     * 总库存
     *
     * 【不影响 {@link #id}】的计算
     */
    private Integer quantity;
    /**
     * 总销量
     *
     * 【不影响 {@link #id}】的计算
     */
    private Integer soldNum;
    private Integer hideStock;
    private Double originPrice;
    private Integer joinLevelDiscount;

    // ========== 价格库存 END ==========

    // ========== 运费信息 BEGIN ==========
    private Integer postType;
    private Integer postFee;
    private Integer deliveryTemplateId;
    // ========== 运费信息 END ==========

    // ========== 其他信息 BEGIN ==========

    private Boolean isListing;
    private Integer order;
    private Date autoListingTime;
    private Boolean isLock;
    private String messages;

    // ========== 其他信息 END ==========

    private Boolean etdStatus;
    private Boolean purchaseRightStatus;

}