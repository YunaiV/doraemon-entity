package cn.iocoder.doraemon.tradegroup.entity;

import java.util.Date;

/**
 * 交易改价信息
 */
public class TradeAdjustFee {

    /**
     * 交易编号 {@link Trade#id}
     */
    private Integer id;
    /**
     * 涨减价格
     */
    private Integer payChange;
    /**
     * 运费调价差值
     */
    private Integer postChange;
    /**
     * 更新时间
     */
    private Date updateTime;

}