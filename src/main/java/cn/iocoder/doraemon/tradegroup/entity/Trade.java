package cn.iocoder.doraemon.tradegroup.entity;

import java.util.Date;

/**
 * 交易
 */
public class Trade {

    // ========= 基础字段 BEGIN =========

    /**
     * 交易编号
     *
     * 唯一，例如：E20180125232933007700006
     */
    private String id;
    /**
     * 店铺编号
     */
    private Integer shopId;
    /**
     * 交易类型
     *
     * 0：FIXED （一口价）
     * 1：GIFT （送礼） // TODO 子订单
     * 2：BULK_PURCHASE（来自分销商的采购）
     * 3：PRESENT （赠品领取）
     * 4：GROUP （拼团订单）
     * 5：PIFA （批发订单）
     * 6：COD （货到付款）
     * 7：PEER （代付）
     * 8：QRCODE（扫码商家二维码直接支付的交易）
     * 9：QRCODE_3RD（线下收银台二维码交易)
     */
    private Integer type;
    /**
     * 交易主状态。
     *
     * TODO 芋艿：TRADE_NO_CREATE_PAY (没有创建支付交易)
     * 3：WAIT_BUYER_PAY (等待买家付款)
     * TODO 芋艿：WAIT_PAY_RETURN (等待支付确认)
     * TODO 芋艿：WAIT_GROUP（等待成团，即：买家已付款，等待成团）
     * 5：WAIT_SELLER_SEND_GOODS (等待卖家发货，即：买家已付款)
     * 6：WAIT_BUYER_CONFIRM_GOODS (等待买家确认收货，即：卖家已发货)
     * 100：TRADE_BUYER_SIGNED (买家已签收，即：交易已完成)
     * 99：TRADE_CLOSED (付款以后用户退款成功或者付款超时或商家取消，即：交易已关闭)
     */
    private Integer status;
    /**
     * 交易创建时间
     */
    private Date createTime;
    /**
     * 交易更新时间。
     *
     * 当交易的：状态改变、备注更改、星标更改 等情况下都会刷新更新时间
     */
    private Date updateTime;
    /**
     * 关闭类型
     *
     * 1-超时未支付
     * 2-退款关闭
     * 4-买家取消
     * 15-已通过货到付款交易
     * ... 可能还有其他关闭原因
     */
    private Integer closeType;
    /**
     * 关闭时间
     */
    private Date closeTime;

    // ========= 基础字段 END =========

    // ========= 买家信息 BEGIN =========
    /**
     * 买家用户编号
     */
    private Integer buyerId;
//    @JsonProperty(value = "fans_info")
//    /**
//     * 用户信息
//     */
//    private YouzanTradeGetResult.FansInfo fansInfo;
    //    /**
//     * 三方APP用户id
//     */
//    private String outerUserId;
    /**
     * 买家购买附言
     */
    private String buyerMessage;

    // ========= 买家信息 END =========

    // ========= 收货人 && 物流信息 BEGIN =========
    /**
     * 收货人的地址编号
     *
     * 当无需物流时，该字段为零
     */
    private Integer receiverAddressId;
    /**
     * 收货人的姓名
     */
    private String receiverName;
    /**
     * 收货人的地区编号
     */
    private Integer receiverPlace;
    /**
     * 收货人的详细地址
     */
    private String receiverAddress;
    /**
     * 收货人的邮编
     */
    private String receiverZip;
    /**
     * 创建交易时的物流方式。
     *
     * 取值范围：
     * 1：express（快递）
     * 2：fetch（到店自提）
     * 3：local（同城配送）
     */
    private Integer shippingType;
    /**
     * 卖家发货时间
     */
    private Date consignTime;
    /**
     * 买家签收时间
     */
    private Date signTime;

    // ========= 收货人信息 END =========

    // ========= 卖家信息 BEGIN =========
    /**
     * 卖家对该交易的备注
     */
    private String tradeMemo;
    /**
     * 卖家备注星标。
     *
     * 取值范围 1、2、3、4、5；
     * 如果为0，表示没有备注星标
     */
    private Integer sellerFlag;
    // ========= 卖家信息 END =========

    // ========= 商品信息 BEGIN =========
    /**
     * 商品购买数量。
     *
     * 当一个 trade 对应多个 order 的时候，值为所有商品购买数量之和
     */
    private Integer num;
    /**
     * 商品数字编号。
     *
     * 当一个trade对应多个order的时候，值为第一个交易明细中的商品的编号
     */
    private Integer itemId;
    /**
     * 商品价格，单位：分。
     *
     * 当一个trade对应多个order的时候，值为第一个交易明细中的商品的价格
     */
    private Integer price;
    /**
     * 商品主图片地址。
     *
     * 当一个trade对应多个order的时候，值为第一个交易明细中的商品的图片地址
     */
    private String picPath;
    /**
     * 交易标题。
     *
     * 以首个商品标题作为此标题的值
     */
    private String title;
    // ========= 商品信息 END =========

    // ========= 退款维权 BEGIN =========
    /**
     * // TODO 芋艿，啥？
     * 交易维权状态。<br>
     * 0 无维权，1 顾客发起维权，2 顾客拒绝商家的处理结果，3 顾客接受商家的处理结果，9 商家正在处理,101 维权处理中,110 维权结束。<br>
     * 备注：1到10的状态码是微信维权状态码，100以上的状态码是有赞维权状态码
     */
    private Long feedback;
    /**
     * * // TODO 芋艿，啥？
     * 退款状态。取值范围：<br>
     * NO_REFUND（无退款）<br>
     * PARTIAL_REFUNDING（部分退款中）<br>
     * PARTIAL_REFUNDED（已部分退款）<br>
     * PARTIAL_REFUND_FAILED（部分退款失败）<br>
     * FULL_REFUNDING（全额退款中）<br>
     * FULL_REFUNDED（已全额退款）<br>
     * FULL_REFUND_FAILED（全额退款失败）<br>
     */
    private String refundStatus;
    // ========= 退款维权 END =========

    // ========= 支付信息 BEGIN =========
    /**
     * 买家付款时间
     */
    private Date payTime;
    /**
     * 支付类型。
     *
     * 取值范围：
     * 1-WEIXIN (微信自有支付)
     * 2-WEIXIN_DAIXIAO (微信代销支付)
     * 3-ALIPAY (支付宝支付)
     * 4-BANKCARDPAY (银行卡支付)
     * 5-PEERPAY (代付)
     * 6-CODPAY (货到付款)
     * 7-BAIDUPAY (百度钱包支付)
     * 8-PRESENTTAKE (直接领取赠品)
     * 9-COUPONPAY（优惠券/码全额抵扣)
     * 10-BULKPURCHASE（来自分销商的采购)
     * 11-MERGEDPAY (合并付货款)
     * 12-ECARD（有赞E卡支付)
     * 13-PREPAIDCARD (储值卡支付)
     * 14-MARKPAY （标记支付）
     * 15-OFCASH (现金支付)
     */
    private Integer payType;
    /**
     * 外部交易编号。
     *
     * 比如，如果支付方式是微信支付，就是财付通的交易单号
     */
    private String outerTid;
    /**
     * 支付流水号（支付单号）
     */
    private String transactionTid;
    // ========= 支付信息 END =========

    // ========= 优惠信息 BEGIN =========

    //    @JsonProperty(value = "coupon_details")
//    /**
//     * 订单中使用到的卡券的数据结构
//     */
//    private YouzanTradeGetResult.UmpTradeCoupon[] couponDetails;
//    @JsonProperty(value = "promotion_details")
//    /**
//     * 订单中使用到的优惠活动的数据结构
//     */
//    private YouzanTradeGetResult.TradePromotion[] promotionDetails;

    // ========= 优惠信息 END =========

    // ========= 价格信息 BEGIN =========
    /**
     * 商品总价（商品价格乘以数量的总金额）。单位：分
     */
    private Integer totalFee;
    /**
     * 运费。单位：分
     */
    private Integer postFee;
    /**
     * 交易优惠金额（不包含交易明细中的优惠金额）。单位：分
     *
     * 【不包括】例如，购买的商品参加限制折扣活动 https://help.youzan.com/qa#/menu/2189/detail/919?_k=00rukd
     * 【包括】】另外，购买的商品使用优惠劵 https://help.youzan.com/qa#/menu/2185/detail/915?_k=lih1k9
     */
    private Integer discountFee;
    /**
     * 实付金额。单位：分
     */
    private Integer payment;
    /**
     * 交易完成后退款的金额。单位：分
     */
    private Integer refundedFee;
    // ========= 价格信息 END =========




    //    /**
//     * 发票抬头
//     */
//    private String invoiceTitle;




//    /**
//     * 交易明细数据结构
//     */
//    private YouzanTradeGetResult.TradeOrderV2[] orders;
//    @JsonProperty(value = "fetch_detail")
//    /**
//     * 到店自提详情
//     */
//    private YouzanTradeGetResult.TradeFetch fetchDetail;


//    @JsonProperty(value = "hotel_info")
//    /**
//     * 酒店入住信息
//     */
//    private YouzanTradeGetResult.HotelInfo hotelInfo;


//    @JsonProperty(value = "sub_trades")
//    /**
//     * 交易数据结构
//     */
//    private YouzanTradeGetResult.TradeDetailV2[] subTrades;
//    @JsonProperty(value = "relation_type")
//    /** TODO 芋艿，等分销
//     * 分销/采购单:source:采购单;fenxiao:分销单 空串则为非分销/采购单
//     */
//    private String relationType;
//    @JsonProperty(value = "relations")
//    /**
//     * relation_type返回source时,为分销订单号列表<br>
//     返回fenxiao时,为供应商订单号列表<br>
//     返回空时,列表返回空
//     */
//    private String[] relations;
//    @JsonProperty(value = "out_trade_no")
//    /**
//     * 代付订单外部交易号列表,非代付订单类型返回空
//     */
//    private String[] outTradeNo;
//    @JsonProperty(value = "profit")
//    /**
//     * 利润（分销订单特有）。格式：5.20；单位：元；精确到：分
//     */
//    private Float profit;
//    @JsonProperty(value = "handled")
//    /**
//     * 结算状态（分销订单特有）。1：已结算，0：未结算
//     */
//    private Long handled;
//    @JsonProperty(value = "outer_user_id")


//    @JsonProperty(value = "shop_id")
//    /**
//     * 多门店订单的门店id 非多门店订单则默认为0
//     */
//    private Long shopId;
//    @JsonProperty(value = "offline_id")
//    /**
//     * 表示线下网点id，包含自提点和门店
//     */
//    private Long offlineId;
//    @JsonProperty(value = "points_price")
//    /**
//     * 积分兑换订单，数值代表消耗的积分 非积分兑换订单默认为0
//     */
//    private Long pointsPrice;
//    @JsonProperty(value = "tuan_no")
//    /**
//     * 拼团订单对应的团编号
//     */
//    private String tuanNo;
//    @JsonProperty(value = "is_tuan_head")
//    /**
//     * 是否为团长订单 1 团长订单 0 非拼团订单 或 非团长订单
//     */
//    private Long isTuanHead;
//    @JsonProperty(value = "qr_id")
//    /**
//     * 收银台订单的二维码id号
//     */
//    private Long qrId;
//    @JsonProperty(value = "delivery_time_display")
//    /**
//     * 同城送订单送达时间
//     */
//    private String deliveryTimeDisplay;
//    @JsonProperty(value = "id_card_number")
//    /**
//     * 海淘订单身份证信息
//     */
//    private String idCardNumber;
//    @JsonProperty(value = "period_order_detail")
//    /**
//     * 周期购信息
//     */
//    private YouzanTradeGetResult.TradePeriodBuy periodOrderDetail;
//    @JsonProperty(value = "lat")
//    /**
//     * 纬度
//     */
//    private String lat;
//    @JsonProperty(value = "lng")
//    /**
//     * 经度
//     */
//    private String lng;
//    @JsonProperty(value = "box_price")
//    /**
//     * 餐盒费
//     */
//    private Float boxPrice;
//    @JsonProperty(value = "invoice_title")

}
