package cn.iocoder.doraemon.tradegroup.logistics.entity;

import java.util.Date;

public class TradeDeliveryExpressOrder {

    /**
     * 交易编号 {@link cn.iocoder.doraemon.tradegroup.trade.entity.Trade#id}
     */
    private String tid;
    /**
     * 交易明细编号 {@link cn.iocoder.doraemon.tradegroup.trade.entity.TradeOrder#id}
     */
    private Long oid;
    /**
     * 快递单号
     */
    private String nu;
    /**
     *
     */
    private Integer expressId;
    /**
     * 状态
     *
     * 1-正常
     * 2-删除
     */
    private Integer status;
    /**
     * 发货时间
     */
    private Date createTime;
    /**
     * 删除时间
     */
    private Date deleteTime;

}
