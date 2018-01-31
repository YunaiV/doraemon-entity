package cn.iocoder.doraemon.tradegroup.delivery.entity;

import java.util.Date;

/**
 * 交易发货设置
 */
public class TradeDeliverySetting {

    /**
     * 店铺编号 {@link cn.iocoder.doraemon.shopgroup.shop.entity.Shop#id}
     */
    private Integer id;
    /**
     * 更新时间
     */
    private Date updateTime;
    /**
     * 是否开通快递发货功能
     */
    private Boolean isExpress;
    /**
     * 计费方式
     *
     * 0-按商品累加运费
     * 1-组合运费（推荐使用）
     *
     * https://bbs.youzan.com/forum.php?mod=viewthread&tid=602557
     */
    private Integer calcType;
    /**
     * 是否支持同城
     */
    private Boolean isLocal;
    /**
     * 是否支持同城定时达
     */
    private Boolean isLocalInTime;
    /**
     * 是否支持自提
     */
    private Boolean isSelf;

}
