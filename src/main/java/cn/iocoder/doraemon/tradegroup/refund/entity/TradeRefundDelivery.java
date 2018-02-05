package cn.iocoder.doraemon.tradegroup.refund.entity;

/**
 * 交易退款维权的退货物流信息
 */
public class TradeRefundDelivery {

    /**
     * 退款编号 {@link TradeRefund#id}
     */
    private String id;
    /**
     * 店铺编号 {@link cn.iocoder.doraemon.shopgroup.shop.entity.Shop#id}
     */
    private Integer shopId;
    /**
     * 物流公司编号 {@link cn.iocoder.doraemon.tradegroup.delivery.entity.Express#id}
     */
    private Integer expressId;
    /**
     * 物流运单编号
     */
    private String nu;
    /**
     * 收件人（卖家）名
     */
    private String receiverName;
    /**
     * 收件人（卖家）手机号
     */
    private String receiverMobile;
    /**
     * 收件人（卖家）座机
     */
    private String receiverTelephone;
    /**
     * 收件人（卖家）收获地区编号
     */
    private Integer receiverRegionId;
    /**
     * 收件人（卖家）收获地址
     */
    private String receiverAddress;
    /**
     * 发件人（买家）手机号
     */
    private String senderMobile;
    /**
     * 发货备注
     */
    private String desc;
    /**
     * 图片举证数组，以逗号分隔
     */
    private String images;
}
