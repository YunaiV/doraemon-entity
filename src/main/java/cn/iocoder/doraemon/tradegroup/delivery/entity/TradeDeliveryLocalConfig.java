package cn.iocoder.doraemon.tradegroup.delivery.entity;

import java.util.Date;
import java.util.List;

/**
 * 交易发货同城配送配置
 */
public class TradeDeliveryLocalConfig {

    /**
     * 配送区域设置
     */
    public static class AreaModel {

        /**
         * 半径区域，以某个坐标点为中心的圆。
         */
        public static class CircleAreaModel {

            /**
             * 经度
             */
            private Double lng;
            /**
             * 纬度
             */
            private Double lat;
            /**
             * 半径
             */
            private Integer scope;

        }

        /**
         * 形成自定义形状的坐标点。
         */
        public static class PointModel {

            /**
             * 经度
             */
            private Double lng;
            /**
             * 纬度
             */
            private Double lat;

        }

        /**
         * 类型
         *
         * 1-半径园 {@link CircleAreaModel}
         * 2-自定义形状 {@link PointModel}
         * 3-简易版
         */
        private Integer type;
        /**
         * 起步价。单位：分。
         *
         * 起送价：是优惠券/码和满减优惠抵扣前的商品金额，运费不计入起送价。
         */
        private Integer startFee;
        /**
         * 配送价。单位：分。
         */
        private Integer fixedFee;

        // ======== 类型【1】BEGIN ========
        /**
         * 半径区域，以某个坐标点为中心。
         */
        private CircleAreaModel circleAreaModel;
        // ======== 类型【1】END ========

        // ======== 类型【2】BEGIN ========
        /**
         * 构成自定义形状的坐标点集合。
         *
         * 实际该字段包在 polygon_area_model 里，此处笔者为了减少嵌套层级。胖友实际在用，建议还是套在 polygon_area_model 里。
         */
        private List<PointModel> pointModels;
        // ======== 类型【1】END ========

        // ======== 类型【3】BEGIN ========
        /**
         * 配送范围介绍
         */
        private String desc;
        /**
         * 配送范围图片
         */
        private String attachPic;
        // ======== 类型【3】END ========
    }

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
         * 周期集合。
         *
         * 注意，通过位进行存储。
         */
        private Integer weekdays;

    }

    /**
     * 店铺编号  {@link cn.iocoder.doraemon.shopgroup.shop.entity.Shop#id}
     */
    private Integer id;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 更新时间
     */
    private Date updateTime;
    /**
     * 配送区域类型
     *
     * 1- 简易版。
     *          没有超区校校验，适合配送范围内地图信息不完善的地区，如新开发区、欠发达地区等。
     * 2- 不同区域不同配送费。
     */
    private Integer editionType;
    /**
     * 配送区域设置数组
     *
     * 使用 JSON 将 {@link AreaModel}数组 格式化成字符串
     */
    private String areaModels;
    /**
     * 是否开启定时达
     */
    private Boolean isInTime;
    /**
     * 配送时间集合
     *
     * 使用 JSON 将 {@link DateRange}数组 格式化成字符串
     */
    private String timeBuckets;
    /**
     * 时段细分类型
     *
     * 1-天
     * 2-上午下午晚上（12:00和18:00为分界点）
     * 3-小时
     * 4-半小时
     */
    private Integer timeSpanType;
    /**
     * 最小可预约时间提前时间，单位：{@link #aheadMinType}
     */
    private Integer aheadMin;
    /**
     * 最小可预约时间提前时间单位
     *
     * 0-无需提前
     * 1-天（为自然天，如：提前1天，则不管是凌晨1点还是晚上23点，都只能下明天以后的订单）
     * 2-小时
     * 3-分钟
     */
    private Integer aheadMinType;
    /**
     * 最大可预约时间提前时间，单位：天。
     *
     * 其中，0 为仅限冬天。
     */
    private Integer aheadMax;

}
