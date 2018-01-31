package cn.iocoder.doraemon.tradegroup.logistics;

import com.youzan.open.sdk.gen.v3_0_0.model.YouzanLogisticsExpressGetResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanLogisticsGoodsexpressGetResult;

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

    /**
     * 获取物流快递信息
     *
     * https://www.youzanyun.com/apilist/detail/group_trade/logistics/youzan.logistics.goodsexpress.get
     *
     * @param expressNo 物流单号
     * @param expressId 快递公司id
     * @return 物流快递信息
     */
    YouzanLogisticsGoodsexpressGetResult getOrder(String expressNo, Integer expressId);

}