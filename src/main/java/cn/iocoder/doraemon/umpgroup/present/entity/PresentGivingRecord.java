package cn.iocoder.doraemon.umpgroup.present.entity;

import java.util.Date;

/**
 * 赠品赠送记录
 */
public class PresentGivingRecord {

    /**
     * 记录编号，自增唯一
     */
    private Integer id;
    /**
     * 店铺编号
     */
    private Integer shopId;
    /**
     * 赠品编号
     */
    private Integer presentId;
    /**
     * 赠品名
     */
    private String presentName;
    /**
     * 商品编号
     */
    private Integer itemId;
    /**
     * 商品标题
     */
    private Integer itemTitle;
    /**
     * 活动编号
     */
    private Integer activityId;
    /**
     * 活动类型
     *
     * 【下面枚举的值不一定正确，形式是这样的形式】
     * 1-满减/送活动
     * 2-刮刮卡活动
     */
    private Integer activityType;
    /**
     * 交易编号 {@link cn.iocoder.doraemon.tradegroup.trade.entity.Trade#id}
     */
    private Integer tid;
    /**
     * 买家编号
     */
    private Integer buyerId;
    /**
     * 状态
     *
     * 1-待领取
     * 2-已领取
     * 3-已过期
     */
    private Integer status;
    /**
     * 创建时间（赠送时间）
     */
    private Date createTime;
    /**
     * 领取过期时间
     */
    private Date expireTime;
    /**
     * 领取时间
     */
    private Date receiveTime;

}