package cn.iocoder.doraemon.umpgroup.packagebuy.entity;

import java.util.Date;
import java.util.List;

/**
 * 优惠套餐活动
 */
public class PackageBuyActivity {

    /**
     * 商品 VO
     */
    public static class ItemVO {

        /**
         * 商品编号
         */
        private Integer itemId;
        /**
         * 商品 SKU 编号数组
         */
        private List<Integer> skuIds;

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
    private String title;
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
     */
    private Integer endType;
    /**
     * 活动到期时间
     */
    private Date expireTime;
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
     * 套餐价格，单位：分
     */
    private Integer price;
    /**
     * 商品原价最小值，单位：分
     */
    private Integer originPriceMin;
    /**
     * 商品原价最大值，单位：分
     */
    private Integer originPriceMax;
    /**
     * 商品数组
     *
     * JSON 格式，数组，每个元素为 {@link ItemVO}
     */
    private String items;
    /**
     * 优惠价格展示
     *
     * false-买家浏览商品详情页时，不能看到套餐优惠价格
     * true-买家浏览商品详情页时，可以看到套餐优惠价格
     */
    private Boolean isShowPreference;

}