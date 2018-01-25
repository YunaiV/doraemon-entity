package cn.iocoder.doraemon.tradegroup.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanTradeGetResult;

/**
 * 交易明细
 */
public class TradeOrder {

    // ========= 基础字段 BEGIN =========

    /**
     * 交易明细编号。
     *
     * 该编号并不唯一，只用于区分交易内的多条明细记录
     */
    private Long id;
    /**
     * 交易编号。{@link Trade#id}
     */
    private Long tid;
    /**
     * 店铺编号
     */
    private Integer shopId;

    // ========= 基础字段 END =========

    // ========= 商品信息 BEGIN =========

    /**
     * 商品数字编号
     */
    private Integer itemId;
    /**
     * Sku 编号
     */
    private Integer skuId;
    /**
     * 商品标题
     */
    private String title;
    /**
     * 商品购买数量
     */
    private Integer num;

    // TODO snapKey

    // ========= 商品信息 END =========

    // ========= 价格信息 BEGIN =========

    // ========= 价格信息 END =========

    @JsonProperty(value = "fenxiao_price")
    /**
     * 商品在分销商那边的出售价格。精确到2位小数；单位：元。如果是采购单才有值，否则值为 0
     */
    private Float fenxiaoPrice;
    @JsonProperty(value = "fenxiao_payment")
    /**
     * 商品在分销商那边的实付金额。精确到2位小数；单位：元。如果是采购单才有值，否则值为 0
     */
    private Float fenxiaoPayment;
    @JsonProperty(value = "price")
    /**
     * 商品价格。精确到2位小数；单位：元
     */
    private Float price;
    @JsonProperty(value = "total_fee")
    /**
     * 应付金额（商品价格乘以数量的总金额）
     */
    private Float totalFee;
    @JsonProperty(value = "discount_fee")
    /**
     * 交易明细内的优惠金额。精确到2位小数，单位：元
     */
    private Float discountFee;
    @JsonProperty(value = "payment")
    /**
     * 实付金额。精确到2位小数，单位：元
     */
    private Float payment;
    @JsonProperty(value = "sku_properties_name")
    /**
     * SKU的值，即：商品的规格。如：机身颜色:黑色;手机套餐:官方标配
     */
    private String skuPropertiesName;
    @JsonProperty(value = "pic_path")
    /**
     * 商品主图片地址
     */
    private String picPath;
    @JsonProperty(value = "pic_thumb_path")
    /**
     * 商品主图片缩略图地址
     */
    private String picThumbPath;
    @JsonProperty(value = "item_type")
    /**
     * 商品类型。<br>0：普通商品；<br>10：分销商品;
     */
    private Long itemType;
    @JsonProperty(value = "buyer_messages")
    /**
     * 交易明细中买家留言的数据结构
     */
    private YouzanTradeGetResult.TradeBuyerMessage[] buyerMessages;
    @JsonProperty(value = "order_promotion_details")
    /**
     * 交易明细中的优惠信息的数据结构
     */
    private YouzanTradeGetResult.TradeOrderPromotion[] orderPromotionDetails;
    @JsonProperty(value = "state_str")
    /**
     * 商品状态
     */
    private String stateStr;
    @JsonProperty(value = "item_refund_state")
    /**
     * 商品退款状态
     */
    private String itemRefundState;
    @JsonProperty(value = "is_virtual")
    /**
     * 1 虚拟商品 0 非虚拟商品
     */
    private Long isVirtual;
    @JsonProperty(value = "is_present")
    /**
     * 1 赠品商品 0 普通商品
     */
    private Long isPresent;
    @JsonProperty(value = "refunded_fee")
    /**
     * 退款金额
     */
    private Float refundedFee;
    @JsonProperty(value = "allow_send")
    /**
     * 是否允许发货  1 可以发货 0 不能发货
     */
    private Long allowSend;
    @JsonProperty(value = "refund_id")
    /**
     * 退款id
     */
    private String refundId;

}
