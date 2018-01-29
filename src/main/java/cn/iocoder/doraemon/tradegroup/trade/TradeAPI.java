package cn.iocoder.doraemon.tradegroup.trade;

import com.youzan.open.sdk.gen.v3_0_0.model.*;

/**
 * 交易 API
 */
public interface TradeAPI {

    /**
     * 下单入口，获得结算页链接
     *
     * https://www.youzanyun.com/apilist/detail/group_buyer/buyer_bill/youzan.trade.bill.good.url.get
     *
     * @param params 单商品相关参数
     * @return 结算页链接
     */
    YouzanTradeBillGoodUrlGetResult getBillItemURL(YouzanTradeBillGoodUrlGetParams params);

    /**
     * 多商品下单入口，获得结算页链接
     *
     * https://www.youzanyun.com/apilist/detail/group_buyer/buyer_bill/youzan.trade.bill.goods.url.get
     *
     * @param params 多商品相关参数
     * @return 结算页链接
     */
    YouzanTradeBillGoodsUrlGetResult getBillItemsURL(YouzanTradeBillGoodsUrlGetParams params);

    /**
     * 订单标星接口
     *
     * https://www.youzanyun.com/apilist/detail/group_trade/trade/youzan.trade.get
     *
     * @param tid 交易订单号
     * @param withChilds 是否需要获取子订单。例如送礼订单，会存在子订单。
     * @param subTradePageNo 指定获取子交易的第几页，不传则获取全部
     * @param subTradePageSize 指定获取子交易的第几页，不传则获取全部
     * @param fields 指到需要返回的交易对象字段，如tid,title,receiver_city等
     * @return 交易详情
     */
    YouzanTradeGetResult get(String tid, Boolean withChilds,
                             Integer subTradePageNo, Integer subTradePageSize, String[] fields);

    /**
     * 根据第三方的ua和user_id获取交易订单列表
     *
     * https://open.youzan.com/api/oauthentry/youzan.trades.sold.outer/3.0.0/get
     *
     * @param params 筛选参数。三方用户 user_id 必填
     * @return 交易列表
     */
    YouzanTradesSoldOuterGetResult listByOutUserId(YouzanTradesSoldOuterGetParams params);

    /**
     * 查询卖家已卖出的交易列表
     *
     * https://www.youzanyun.com/apilist/detail/group_trade/trade/youzan.trades.sold.get
     *
     * @param params 筛选参数
     * @return 交易列表
     */
    YouzanTradesSoldGetResult list(YouzanTradesSoldGetParams params);

    /**
     * 订单标星接口
     *
     * https://www.youzanyun.com/apilist/detail/group_trade/trade/youzan.trade.star.update
     *
     * @param tid 交易编号
     * @param star 等级 1-5
     * @return 是否成功
     */
    Boolean updateStar(String tid, Integer star);

    /**
     * 增加/修改订单备注
     *
     * https://www.youzanyun.com/apilist/detail/group_trade/trade/youzan.trade.memo.update
     *
     * @param tid 交易编号
     * @param memo 订单备注
     * @param star 等级 1-5
     * @return 是否成功
     */
    Boolean updateMemo(String tid, String memo, Integer star);

    /**
     * 买家下单后未支付的情况下卖家关闭订单，在买家付款后该接口失效
     *
     * https://open.youzan.com/api/oauthentry/youzan.trade/3.0.0/close
     *
     * @param tid 交易编号
     * @param closeType 订单备注
     * @param closeReason 等级 1-5
     * @return 是否成功
     */
    Boolean updateClose(String tid, Integer closeType, Integer closeReason);

    /**
     * 订单改价
     *
     * https://www.youzanyun.com/apilist/detail/group_trade/trade/youzan.trade.price.update
     *
     * @param tid 交易编号
     * @param priceChange 价格增减(单位:分）
     * @param postFee 邮费价格(单位:分）
     * @param isAllowPreference 改价后允许是否允许买家再使用其他优惠。TODO 芋艿，目前暂未找到该参数的场景
     * @return 是否成功
     */
    Boolean updatePrice(String tid, Integer priceChange, Integer postFee, Boolean isAllowPreference);

    // TODO 芋艿，获取电子卡券信息 https://www.youzanyun.com/apilist/detail/group_trade/trade/youzan.trade.virtualticket.get

    // TODO 芋艿，获取到店自提订单信息 https://www.youzanyun.com/apilist/detail/group_trade/trade/youzan.trade.selffetchcode.get

    // TODO 芋艿，微信支付-自有订单标记退款 https://www.youzanyun.com/apilist/detail/group_trade/trade/youzan.trade.sign.item.close

}
