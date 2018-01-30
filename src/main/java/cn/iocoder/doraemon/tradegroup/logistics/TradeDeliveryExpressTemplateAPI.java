package cn.iocoder.doraemon.tradegroup.logistics;

import com.youzan.open.sdk.gen.v3_0_0.model.YouzanLogisticsTemplateSearchResult;

import java.util.List;

/**
 * 交易发货快递运费模板 API
 */
public interface TradeDeliveryExpressTemplateAPI {

    /**
     * 获取店铺所有物流模板列表
     *
     * https://open.youzan.com/api/oauthentry/youzan.logistics.template/3.0.0/search
     *
     * @param pageNo 页码
     * @param pageSize 分页值，默认20
     * @return 店铺全部物流模板
     */
    List<YouzanLogisticsTemplateSearchResult.LogisticsDeliveryTemplateOpenApiModelV2> search(Integer pageNo, Integer pageSize);

    /**
     * 创建物流模板
     *
     * https://www.youzanyun.com/apilist/detail/group_trade/logistics/youzan.logistics.template.create
     *
     * @param name 模板名称
     * @param payType 付费类型
     * @param valuationType 计算类型
     * @param valuationRules 运费规则 json格式，转换成 List<ValuationRule>
     */
    void create(String name, Integer payType, Integer valuationType, String valuationRules);

    // update 接口，操作界面有，API 暂未提供。胖友自行 YY 。

    /**
     * 删除模板
     *
     * https://www.youzanyun.com/apilist/detail/group_trade/logistics/youzan.logistics.template.delete
     *
     * @param templateId 模板id
     * @return 是否成功
     */
    Boolean delete(Integer templateId);
}