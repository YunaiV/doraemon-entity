package cn.iocoder.doraemon.umpgroup.limitdiscount.entity;

import java.util.Date;

/**
 * 限制折扣活动
 */
public class LimitDiscountActivity {

    /**
     * 商品 VO
     */
    public static class ItemVO {

        /**
         * 商品编号
         */
        private Integer itemId;
        /**
         * 打折方式
         *
         * 2-打折
         * 3-减价
         */
        private Integer discountType;
        /**
         * 当【打折】时，折扣，百分比。例如：75 折为 75 。
         * 当【减价】时，价格，单位：分。例如：8 分为 8 。
         */
        private Integer discountValue;

    }

    /**
     * 编号，自增唯一
     */
    private Integer id;
    /**
     * 名称
     */
    private String name;
    /**
     * 描述，2 到 5 字。
     */
    private String description;
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
     * 周期类型
     *
     * 0-none，无
     * 1-daily，每天
     * 2-monthly，每月
     * 3-weekly，每周
     */
    private Integer periodType;
    /**
     * 周期开始时间，例如：0000
     *
     * 适用：所有周期类型
     */
    private Integer periodStartTime;
    /**
     * 周期结束时间，例如：2359
     *
     * 适用：所有周期类型
     */
    private Integer periodStartEnd;
    /**
     * 周期每月几号
     *
     * 适用：每月
     */
    private Integer periodMonthDay;
    /**
     * 每周几集合，通过字节位存储周几
     *
     * 适用：每周
     */
    private Integer periodWeekdays;
    /**
     * 限购设置类型
     *
     * 0-不限购
     * 1-每人每种商品限购件数
     * 2-每人每种商品前件数享受折扣
     */
    private Integer quotaType;
    /**
     * 限购数量，根据 {@link #quotaType} 限制。
     */
    private Integer quota;
    /**
     * 抹零方式
     *
     * 1-不抹零
     * 2-抹去角和分
     * 3-抹去分
     */
    private Integer earseType;
    /**
     * 商品数组
     *
     * JSON 格式，数组，每个元素为 {@link ItemVO}
     */
    private String items;

}