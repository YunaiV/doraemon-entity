package cn.iocoder.doraemon.tradegroup.trade.entity;

/**
 * 交易明细。
 *
 * 交易下的每种商品生成一条交易明细记录。
 */
public class TradeOrder {

    // ========= 基础字段 BEGIN =========

    /**
     * 交易明细编号。
     */
    private Long id;
    /**
     * 交易编号。{@link Trade#id}
     */
    private String tid;
    /**
     * 店铺编号
     */
    private Integer shopId;
    /**
     * 交易明细主状态
     *
     * {@link Trade#status} 一致
     */
    private Integer status;

    // ========= 基础字段 END =========

    // ========= 商品信息 BEGIN =========

    /**
     * 商品编号
     */
    private Integer itemId;
    /**
     * 商品标题
     */
    private String title;
    /**
     * 商品主图片地址
     */
    private String picPath;
    /**
     * 商品类型。
     *
     * 0：自营；
     * 10：分销商品;
     */
    private Long goodsType;
    /**
     * 商品类型 {@link cn.iocoder.doraemon.itemgroup.item.entity.Item#itemType}
     */
    private Integer itemType;
    /**
     * Sku 编号
     */
    private Integer skuId;
    /**
     * SKU的值，即：商品的规格。如：机身颜色:黑色;手机套餐:官方标配
     */
    private String skuPropertiesName;
    /**
     * 商品价格。单位：分
     */
    private Integer price;
    /**
     * 商品购买数量
     */
    private Integer num;
    /**
     * 交易明细中买家留言的数据结构 {@link cn.iocoder.doraemon.itemgroup.item.entity.Item#messages}
     */
    private String buyerMessages;
    /**
     * 商品快照编号 {@link cn.iocoder.doraemon.itemgroup.snapshot.entity.ItemSnapshot#id}
     */
    private String snapshotId;

    // ========= 商品信息 END =========

    // ======= 物流信息 BEGIN =======

    /**
     * 是否允许发货
     */
    private Boolean allowSend;
    /**
     * 是否已经发货
     */
    private Boolean isSend;

    // ======= 物流信息 END =======

    // ========= 退款维权 BEGIN =========

    /**
     * 商品退款状态
     *
     * 0 - 无退款
     * 1 - 部分退款
     * 11 - 全部退款
     */
    private Integer refundStatus;
    /**
     * 退款id
     */
    private String refundId;

    // ========= 退款维权 END =========

    // ========= 价格信息 BEGIN =========

    /**
     * 商品总价（商品价格乘以数量的总金额）。单位：分
     */
    private Integer totalFee;
    /**
     * 交易明细内的优惠金额。单位：分
     */
    private Integer discountFee;
    /**
     * 实付金额。单位：分
     */
    private Integer payment;
    /**
     * 退款金额。单位：分
     */
    private Float refundedFee;

    // ========= 价格信息 END =========

    // ========= 优惠信息 BEGIN =========

//    /**
//     * 是否赠品
//     *
//     * true 赠品商品
//     * false 普通商品
//     */
//    private Boolean isPresent;
//    /**
//     * 交易明细中的优惠信息的数据结构
//     */
//    private YouzanTradeGetResult.TradeOrderPromotion[] orderPromotionDetails;

    // ========= 优惠信息 END =========







// TODO 芋艿，等分销
//    @JsonProperty(value = "fenxiao_price")
//    /**
//     * 商品在分销商那边的出售价格。精确到2位小数；单位：元。如果是采购单才有值，否则值为 0
//     */
//    private Float fenxiaoPrice;
//    /**
//     * 商品在分销商那边的实付金额。精确到2位小数；单位：元。如果是采购单才有值，否则值为 0
//     */
//    private Float fenxiaoPayment;
}
