package cn.iocoder.doraemon.tradegroup.refund.entity;

public class TradeRefund {

    /**
     * 乐观锁版本号
     *
     * 解决并发修改，防止数据不一致。
     */
    private Integer version;
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
}