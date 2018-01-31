package cn.iocoder.doraemon.tradegroup.trade.entity;

import java.util.Date;

/**
 * 交易上门自提信息
 */
public class TradeSelfFetch {

    /**
     * 交易编号 {@link Trade#id}
     */
    private String id;
    /**
     * 店铺编号 {@link cn.iocoder.doraemon.shopgroup.shop.entity.Shop#id}
     */
    private Integer shopId;
    /**
     * 自提人的手机
     */
    private String fetcherMobile;
    /**
     * 自提人的名字
     */
    private String fetcherName;
    /**
     * 自提开始时间
     *
     * 当为空时，任意时间都可自提。
     */
    private Date fetchStartTime;
    /**
     * 自提结束时间
     *
     * 当为空时，任意时间都可自提。
     */
    private Date fetchEndTime;
    /**
     * 自提提货码，例如 5508 8906 062
     */
    private String fetchCode;
    /**
     * 上门自提点的编号 {@link cn.iocoder.doraemon.tradegroup.delivery.entity.TradeDeliverySelfFetchAddress#id}
     */
    private Integer fetchAddressId;
    /**
     * 上门自提点的地区编号
     *
     * 冗余，避免删除
     */
    private Integer fetchRegionId;
    /**
     * 上门自提点的地址
     *
     * 冗余，避免修改
     */
    private String fetchAddress;
    /**
     * 上门自提点的联系电话
     *
     * 冗余，避免修改
     */
    private String fetchPhone;

}