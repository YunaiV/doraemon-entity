package cn.iocoder.doraemon.umpgroup.counpon.entity;

import java.util.Date;

/**
 * 优惠券（码）核销记录
 */
public class CouponVerifyLog {

    /**
     * 记录编号，唯一自增
     */
    private Integer id;
    /**
     * 店铺编号
     */
    private Integer shopId;
    /**
     * 创建时间（验证时间）
     */
    private Date createTime;
    /**
     * 类型
     *
     * 1-优惠劵
     * 2-优惠码
     */
    private Integer type;
    /**
     * 优惠劵（码）分组编号，{@link CouponGroup#id}
     */
    private Integer couponGroupId;
    /**
     * 标题
     */
    private String title;
    /**
     * 使用说明
     */
    private String descrption;
    /**
     * 优惠劵（码）编号，{@link Coupon#id}
     */
    private Integer couponId;
    /**
     * 核销码
     */
    private String verifyCode;
    /**
     * 验证方式
     *
     * 1-扫码
     * 2-手动输入
     */
    private Integer verifyType;
    /**
     * 验证管理员编号
     */
    private Integer adminId;
    /**
     * 是否设置满多少金额可用，单位：分
     *
     * 0-不限制
     * 大于0-多少金额可用
     */
    private Integer condition;
    /**
     * 优惠类型
     *
     * 1-代金卷
     * 2-折扣卷
     */
    private Integer preferentialType;
    /**
     * 折扣
     */
    private Double discount;
    /**
     * 优惠金额，单位：分
     */
    private Integer value;
    /**
     * 使用订单号
     */
    private String usedInTid;

}
