package cn.iocoder.doraemon.tradegroup.refund.entity;

import java.util.Date;

/**
 * 交易退款维权的协商记录
 */
public class TradeRefundMessage {

    /**
     * 明细
     */
    public static class Detail {

        /**
         * 标题
         */
        private String title;
        /**
         * 内容
         */
        private String content;

    }

    /**
     * 记录编号，唯一。
     */
    private Integer id;
    /**
     * 退款编号 {@link TradeRefund#id}
     */
    private String refundId;
    /**
     * 店铺编号 {@link cn.iocoder.doraemon.shopgroup.shop.entity.Shop#id}
     */
    private Integer shopId;
    /**
     * 发起角色
     *
     * 1 - 系统
     * 2 - 买家
     * 3 - 商家
     * 4 - 客服
     */
    private Integer ownerRole;
    /**
     * 具体操作
     *
     * 例如：
     *   250 - 同意退款给买家，本次维权结束
     *   206 - 已退货,等待商家确认收货
     *   205 - 已同意退款申请,等待买家退货
     *   201 - 发起了退款申请,等待商家处理
     */
    private Integer op;
    /**
     * 操作前状态
     */
    private Integer beforeStatus;
    /**
     * 操作后状态
     */
    private String afterStatus;
    /**
     * 明细数组字符串
     *
     * JSON 格式，数组，每个元素为 {@link Detail}
     */
    private String details;
    /**
     * 图片地址数组字符串
     */
    private String picURLs;
    /**
     * 创建时间
     */
    private Date createTime;

}