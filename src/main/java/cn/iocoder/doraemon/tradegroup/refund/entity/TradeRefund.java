package cn.iocoder.doraemon.tradegroup.refund.entity;

import java.util.Date;

/**
 * 交易退款维权
 */
public class TradeRefund {

    /**
     * 编号
     *
     * 唯一
     */
    private String id;
    /**
     * 店铺编号 {@link cn.iocoder.doraemon.shopgroup.shop.entity.Shop#id}
     */
    private Integer shopId;
    /**
     * 交易编号 {@link cn.iocoder.doraemon.tradegroup.trade.entity.Trade#id}
     */
    private String tid;
    /**
     * 交易明细编号 {@link cn.iocoder.doraemon.tradegroup.trade.entity.TradeOrder#id}
     */
    private String oid;
    /**
     * 商品编号 {@link cn.iocoder.doraemon.tradegroup.trade.entity.TradeOrder#itemId}
     */
    private Integer itemId;
    /**
     * 退款状态
     *
     * 1 - WAIT_SELLER_AGREE - 买家已经申请退款，等待卖家同意
     * 2 - WAIT_BUYER_RETURN_GOODS - 卖家已经同意退款，等待买家退货
     * 3 - WAIT_SELLER_CONFIRM_GOODS - 买家已经退货，等待卖家确认收货
     * 4 - SELLER_REFUSE_BUYER - 卖家拒绝退款
     * 5 - SELLER_REFUSE_CONFIRM_GOODS - 卖家不同意，未收到货
     * 10 - CLOSED - 退款关闭
     * 20 - SUCCESS - 退款成功
     */
    private Integer status;
    /**
     * 客满介入状态
     *
     * 1 - 客满未介入
     * 2 - 客满介入中
     */
    private Integer csStatus;
    /**
     * 是否退货
     *
     * false - 仅退款
     * true - 退货退款
     */
    private Boolean returnItem;
    /**
     * 买家退款申请说明
     */
    private String desc;
    /**
     * 是否签收货物
     *
     * false - 否
     * true - 是
     */
    private Boolean signed;
    /**
     * 仅退款-未收到货申请原因
     *      11(质量问题)
     *      12(拍错/多拍/不喜欢)
     *      3(商品描述不符)
     *      14(假货), 15(商家发错货)
     *      16(商品破损/少件)
     *      17(其他)
     * 仅退款-已收到货申
     *      51(多买/买错/不想要)
     *      52(快递无记录)
     *      53(少货/空包裹)
     *      54(未按约定时间发货)
     *      55(快递一直未送达)
     *      56(其他)
     * 退货退款-申请原因
     *      101(商品破损/少件)
     *      102(商家发错货)
     *      103(商品描述不符)
     *      104(拍错/多拍/不喜欢)
     *      105(质量问题)
     *      107(其他)
     */
    private Integer reasonType;
    /**
     * 申请退款的金额，单位：分。
     */
    private Integer refundFee;
    /**
     * 退款申请时间
     */
    private Date createTime;
    /**
     * 退款申请修改时间
     */
    private Date updateTime;
    /**
     * 乐观锁版本号
     *
     * 解决并发修改，防止数据不一致。
     */
    private Integer version;

}