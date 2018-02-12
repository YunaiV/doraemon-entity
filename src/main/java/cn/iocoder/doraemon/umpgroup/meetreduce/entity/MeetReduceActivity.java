package cn.iocoder.doraemon.umpgroup.meetreduce.entity;

import java.util.Date;

/**
 * 满减送活动
 */
public class MeetReduceActivity {

    /**
     * 优惠 VO
     */
    public static class PreferentialVO {

        /**
         * 满足金额，单位：分
         */
        private Integer meet;
        /**
         * 是否减现金，和 {@link #isDiscountRequired} 互斥
         */
        private Boolean isCashRequired;
        /**
         * 减现金，单位：分
         */
        private Integer cash;
        /**
         * 是否打折，和 {@link #isCashRequired} 互斥
         */
        private Boolean isDiscountRequired;
        /**
         * 折扣，百分比。例如：75 折为 75 。
         */
        private Integer discount;
        /**
         * 是否包邮
         */
        private Boolean isPostage;
        /**
         * 是否送积分
         */
        private Boolean isScoreRequired;
        /**
         * 积分
         */
        private Integer score;
        /**
         * 是否送优惠劵（码）
         */
        private Boolean isCouponRequired;
        /**
         * 优惠劵（码）分组编号
         */
        private Integer couponGroupId;
        /**
         * 优惠劵（码）数量
         */
        private Integer couponNum;
        /**
         * 是否送赠品
         */
        private Boolean isPresentRequired;
        /**
         * 赠品编号
         */
        private Integer presentId;

    }

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
     * 优惠数组
     *
     * JSON 格式，数组，每个元素为 {@link PreferentialVO}
     */
    private String preferentials;
    /**
     * 可用范围的类型
     *
     * 1-部分（ALL）：全部商品可用
     * 2-全部（PART）：部分商品可用，或指定商品可用
     */
    private Integer rangeType;
    /**
     * 指定可用商品列表，使用逗号分隔商品编号 {@link cn.iocoder.doraemon.itemgroup.item.entity.Item#id}
     */
    private String rangeValues;

}