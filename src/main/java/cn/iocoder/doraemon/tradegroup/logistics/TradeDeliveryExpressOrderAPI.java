package cn.iocoder.doraemon.tradegroup.logistics;

import com.youzan.open.sdk.gen.v3_0_0.model.YouzanLogisticsExpressbyordernoSearchResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanLogisticsGoodsexpressGetResult;

import java.util.List;

/**
 * 交易发货快递订单 API
 */
public interface TradeDeliveryExpressOrderAPI {

    /**
     * 通过交易号获取所有包裹信息
     *
     * https://www.youzanyun.com/apilist/detail/group_trade/logistics/youzan.logistics.expressbyorderno.search
     *
     * @param tid 交易号
     * @return 物流详情列表
     */
    List<YouzanLogisticsExpressbyordernoSearchResult.LogisticsGoodsOrderExpressModel> search(String tid);

    /**
     * 通过交易明细（交易订单）编号获取包裹信息
     *
     * https://www.youzanyun.com/apilist/detail/group_trade/logistics/youzan.logistics.expressbyorderno.get
     *
     * 注意，这个 API 笔者做了调整。
     *      如果传递 tid ，那么和 {@link #search(String)} 又重复了
     *      并且，返回的只有单条包裹信息，但是一个交易下可以有多个包裹信息。
     *      因此，笔者觉得应该是根据交易明细（交易订单）编号查询。
     *
     * @param oid 交易明细（交易订单）编号
     * @return 物流详情
     */
    YouzanLogisticsGoodsexpressGetResult get(String oid);

}