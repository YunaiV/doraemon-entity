package cn.iocoder.doraemon.tradegroup.delivery.entity;

import java.util.Date;
import java.util.List;

/**
 * 交易发货快递运费模板
 */
public class TradeDeliveryExpressTemplate {

    /**
     * 运费规范
     */
    public static class ValueRule {

        /**
         * 地区编号数组
         */
        private List<String> regions;
        /**
         * 首件数量，单位根据 {@link #valuationType}
         */
        private Integer firstAmount;
        /**
         * 首件运费，单位：分
         */
        private Integer firstFee;
        /**
         * 续件数量，单位根据 {@link #valuationType}
         */
        private Integer additionalAmount;
        /**
         * 续件运费，单位：分
         */
        private Integer additionalFee;

    }

    /**
     * 模板编号
     */
    private Integer id;
    /**
     * 店铺编号
     */
    private Integer shopId;
    /**
     * 模板名称
     */
    private String name;
    /**
     * 状态
     *
     * 1-正常
     * 2-删除
     */
    private Integer status;
    /**
     * 当前使用次数
     *
     * 当使用次数大于零，不能删除
     */
    private Integer useCount;
    /**
     * 付费类型
     *
     * 1-买家付费
     * 2-卖家付费
     */
    private Integer payType;
    /**
     * 是否包邮
     *
     * 0-否
     * 1-是
     * 2-部分
     */
    private Integer freeType;
    /**
     * 复制于哪个模板的编号
     */
    private Integer copyOfTemplateId;
    /**
     * 计算类型
     *
     * 1-按件
     * 2-按重量
     * 3-按体积
     */
    private Integer valuationType;
    /**
     * 运费规则数组
     *
     * 使用 JSON 将 {@link ValueRule}数组 格式化成字符串
     */
    private String valuationRules;
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
    private Integer deleteTime;

}