package cn.iocoder.doraemon.tradegroup.delivery.entity;

import java.util.Date;
import java.util.List;

/**
 * 交易买家上门自提点
 */
public class TradeDeliverySelfFetchAddress {

    /**
     * 时间范围
     */
    public static class DateRange {

        /**
         * 开始时间。
         *
         * 格式为 HHdd ，例如 0730
         */
        private Integer openTime;
        /**
         * 结束时间。
         *
         * 格式为 HHdd ，例如 2300
         */
        private Integer closeTime;
        /**
         * 周几集合
         *
         * x 为 周x ，例如，1 = 周一 。
         */
        private List<Integer> weekdays;

    }

    /**
     * 自提点编号
     */
    private Integer id;
    /**
     * 店铺编号 {@link cn.iocoder.doraemon.shopgroup.shop.entity.Shop#id}
     */
    private Integer shopId;
    /**
     * 自提点名
     */
    private String name;
    /**
     * 商家推荐（描述）
     */
    private String description;
    /**
     * 自提点照片数组，以逗号分隔。
     */
    private String images;
    /**
     * 联系电话 - 区号
     */
    private String phone1;
    /**
     * 联系电话 - 电话或手机
     */
    private String phone2;
    /**
     * 状态
     *
     * 1-正常
     * 2-删除
     */
    private Integer status;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 更新时间
     */
    private Date updateTime;
    /**
     * 删除时间
     */
    private Date deleteTime;

    // ========== 地点相关 BEGIN ==========
    /**
     * 地点编号 {@link cn.iocoder.doraemon.commongroup.entity.CommonRegion#id}
     *
     * 最细维度
     */
    private Integer regionId;
    /**
     * 地址
     */
    private String address;
    /**
     * 经度
     */
    private Double lng;
    /**
     * 纬度
     */
    private Double lat;

    // ========== 地点相关 END ==========

    /**
     * 是否作为门店接待
     */
    private Boolean isStore;
    /**
     * 接待时间集合
     *
     * 使用 JSON 将 {@link DateRange}数组 格式化成字符串
     */
    private String businessHoursAdvanceds;
    /**
     * 是否需要买家选择自提时间
     *
     * true 勾选后，买家下单选择上门自提，必须选择自提时间，卖家需要按约定时间备货。
     * false 不勾选，将会提示买家尽快到店自提
     */
    private Boolean isOptionalSelfFetchTime;
    /**
     * 自提时间集合
     *
     * 使用 JSON 将 {@link DateRange}数组 格式化成字符串
     */
    private String offlineBusinessHours;

}
