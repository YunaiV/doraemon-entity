package cn.iocoder.doraemon.tradegroup.delivery;

import com.youzan.open.sdk.gen.v3_0_0.model.YouzanLogisticsLocalGetResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanLogisticsLocalSetParams;

/**
 * 交易发货同城配送配置 API
 */
public interface TradeDeliveryLocalConfigAPI {

    /**
     * 读取商家同城配置的信息
     *
     * https://www.youzanyun.com/apilist/detail/group_trade/logistics/youzan.logistics.local.get
     *
     * @return 交易发货同城配送配置
     */
    YouzanLogisticsLocalGetResult get();

    /**
     * 设置商家同城配置的信息
     *
     * https://www.youzanyun.com/apilist/detail/group_trade/logistics/youzan.logistics.local.set
     *
     * @param params 更新的信息参数
     * @return 是否成功
     */
    Boolean update(YouzanLogisticsLocalSetParams params);

}