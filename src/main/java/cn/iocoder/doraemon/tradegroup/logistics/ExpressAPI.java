package cn.iocoder.doraemon.tradegroup.logistics;

import com.youzan.open.sdk.gen.v3_0_0.model.YouzanLogisticsExpressGetResult;

import java.util.List;

/**
 * 快递 API
 */
public interface ExpressAPI {

    /**
     * 获取快递公司的列表
     *
     * https://www.youzanyun.com/apilist/detail/group_trade/logistics/youzan.logistics.express.get
     *
     * @return 所有物流公司地址
     */
    List<YouzanLogisticsExpressGetResult.LogisticsExpressOpenApiModel> gets();



}