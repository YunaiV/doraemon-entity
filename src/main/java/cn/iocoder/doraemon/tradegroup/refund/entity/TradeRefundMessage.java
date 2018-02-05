package cn.iocoder.doraemon.tradegroup.refund.entity;

import java.util.Date;

/**
 * 交易退款维权的协商记录
 */
public class TradeRefundMessage {

    /**
     * 退款编号 {@link TradeRefund#id}
     */
    private String id;
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
     * 信息
     */
    private String content;
    /**
     * 图片信息
     */
    private String picURL;
    /**
     * 创建时间
     */
    private Date createTime;

}