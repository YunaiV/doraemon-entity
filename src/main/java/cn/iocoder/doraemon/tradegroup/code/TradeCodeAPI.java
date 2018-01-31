package cn.iocoder.doraemon.tradegroup.code;

/**
 * 交易核销 API
 */
public interface TradeCodeAPI {

    /**
     * 用于核销到店自提订单
     *
     * https://www.youzanyun.com/apilist/detail/group_trade/trade_virtual/youzan.trade.selffetchcode.apply
     *
     * @param extraInfo 核销人（开发者根据自己业务规则传，一般为网点号或手机号）
     * @param code 消费者端的到店自提订单提货码
     * @return 是否成功
     */
    Boolean applySelfFetch(String extraInfo, String code);

    // TODO 电子卡券整单核销 https://www.youzanyun.com/apilist/detail/group_trade/trade_virtual/youzan.trade.virtualticket.verifycode
    // TODO 电子卡券单个码券核销 https://www.youzanyun.com/apilist/detail/group_trade/trade_virtual/youzan.trade.virtualticket.verifyticket


    // TODO 使用购买虚拟商品获得的码 https://www.youzanyun.com/apilist/detail/group_trade/trade_virtual/youzan.trade.virtualcode.apply

}