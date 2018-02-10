package cn.iocoder.doraemon.tradegroup.cart.entity;

import java.util.Date;

/**
 * 购物车的商品信息
 */
public class TradeCartItem {

    // ========= 基础字段 BEGIN =========

    /**
     * 编号，唯一自增。
     */
    private Integer id;
    /**
     * 店铺编号
     */
    private Integer shopId;
    /**
     * 状态
     *
     * 1-正常
     * 2-主动删除
     * 3-下单删除
     */
    private Integer status;
    /**
     * 商品放入购物车时间
     */
    private Date createTime;
    /**
     * 商品在购物车中的更新时间
     */
    private Date updateTime;
    /**
     * 商品在购物车中的删除时间
     */
    private Date deleteTime;

    // ========= 基础字段 END =========

    // ========= 买家信息 BEGIN =========

    /**
     * 买家编号
     */
    private Integer buyerId;
    /**
     * 会话 key
     */
    private String nobody;

    // ========= 买家信息 END =========

    // ========= 商品信息 BEGIN =========

    /**
     * 商品编号
     */
    private Integer itemId;
    /**
     * 商品 SKU 编号
     */
    private Integer skuId;
    /**
     * 商品购买数量
     */
    private Integer num;
    /**
     * 交易明细中买家留言的数据结构 {@link cn.iocoder.doraemon.itemgroup.item.entity.Item#messages}
     */
    private String buyerMessages;

    // ========= 商品信息 END =========

    // ========= 交易信息 BEGIN =========

    /**
     * 订单编号
     */
    private String tid;
    /**
     * 下单时间
     */
    private Date buyTime;

    // ========= 交易信息 BEGIN =========

    // ========= 优惠信息 BEGIN =========

    /**
     * 商品营销活动编号
     */
    private Integer activityId;
    /**
     * 商品营销活动类型
     */
    private Integer activityType;

    // ========= 优惠信息 END =========

}
