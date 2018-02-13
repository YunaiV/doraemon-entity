package cn.iocoder.doraemon.umpgroup.bale.entity;

import java.util.Date;

/**
 * 打包一口价活动
 */
public class BaleActivity {

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
     * 打包价格，单位：分
     */
    private Integer balePrice;
    /**
     * 任选件数
     */
    private Integer baleNum;
    /**
     * 优惠是否叠加
     *
     * 可与优惠券、优惠码、满减、支付有礼、订单返现促销活动进行优惠叠加
     */
    private Boolean isPreferentialOverlay;
    /**
     * 指定可用商品列表，使用逗号分隔商品编号 {@link cn.iocoder.doraemon.itemgroup.item.entity.Item#id}
     */
    private String items;

}