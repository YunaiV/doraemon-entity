package cn.iocoder.doraemon.tradegroup.delivery;

/**
 * 交易发货核心 API
 */
public interface TradeDeliveryOnlineAPI {

    /**
     * 运费计算
     *
     * https://www.youzanyun.com/apilist/detail/group_trade/logistics/youzan.logistics.fee.get
     *
     * @param tid 交易编号
     * @param itemParamList 交易商品列表，例如 [{"amount":1,"itemId":1,"itemType":0,"skuId":1,"supplyKdtId":0,"templateId":1,"unifiedPostage":1}]
     * @param provinceName 省份名
     * @param cityName 城市名
     * @param countyName 地区名
     * @return 运费。单位：分
     */
    int getFee(String tid, String itemParamList, String provinceName, String cityName, String countyName);

    /**
     * 卖家确认发货
     * 确认发货的目的是让交易流程继续走下去，确认发货后交易状态会由【买家已付款】变为【卖家已发货】
     *
     * https://www.youzanyun.com/apilist/detail/group_trade/logistics/youzan.logistics.online.confirm
     *
     * @param tid 交易编号
     * @param outerTid 外部交易编号
     * @param oids 交易明细编号数组。如果需要拆单发货，使用该字段指定要发货的商品交易明细编号，多个明细编号用半角逗号“,”分隔； 不需要拆单发货，则该字段不传或值为空；
     * @param isNoExpress 发货是否无需物流。如果无需物流，不需要传递 nu / expressId 参数
     * @param nu 快递单号（具体一个物流公司的真实快递单号）
     * @param expressId 物流公司编号
     * @param issue 配送期次，周期购订单专用，例如：1，表示配送第1期
     * @return 是否成功
     */
    Boolean confirm(String tid, String outerTid, String[] oids, Boolean isNoExpress, String nu, Integer expressId, Integer issue);

    /**
     * 卖家标记签收
     * 标记签收的目的是让交易流程继续走下去，标记签收后交易状态会由【卖家已发货】变为【买家已签收】，通常到店自提的订单需要卖家做标记签收操作
     *
     * https://www.youzanyun.com/apilist/detail/group_trade/logistics/youzan.logistics.online.marksign
     *
     * @param tid 交易编号
     * @return 是否成功
     */
    Boolean markSign(String tid);

}
