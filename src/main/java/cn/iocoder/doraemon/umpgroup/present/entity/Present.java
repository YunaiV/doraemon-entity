package cn.iocoder.doraemon.umpgroup.present.entity;

import java.util.Date;

/**
 * 赠品
 */
public class Present {

    /**
     * 编号，自增唯一
     */
    private Integer id;
    /**
     * 店铺编号
     */
    private Integer shopId;
    /**
     * 名称
     */
    private String name;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 更新时间
     */
    private Date updateTime;
    /**
     * 状态
     *
     * 1-未开始
     * 2-进行中
     * 3-已结束
     * 4-已删除
     */
    private Integer status;
    /**
     * 结束类型
     *
     * 1-活动到期
     * 2-手动删除
     * 3-手动失效
     */
    private Integer endType;
    /**
     * 活动到期时间
     */
    private Date expireTime;
    /**
     * 设置为失效时间
     */
    private Date invalidTime;
    /**
     * 删除时间
     */
    private Date deleteTime;
    /**
     * 开始时间
     */
    private Date startTime;
    /**
     * 结束时间
     */
    private Date endTime;
    /**
     * 领取有效期，单位：天。
     */
    private Integer expirationDays;
    /**
     * 领取限制
     */
    private Integer limit;
    /**
     * 商品编号
     */
    private Integer itemId;
    /**
     * 当前赠送数量
     */
    private Integer givingNum;
    /**
     * 当前领取数量
     */
    private Integer receiveNum;

}