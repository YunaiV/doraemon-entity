package cn.iocoder.doraemon.tradegroup.logistics;

import com.youzan.open.sdk.gen.v3_0_0.model.YouzanLogisticsSettingGetResult;

/**
 * 交易发货设置 API
 */
public interface TradeDeliverySettingAPI {

    /**
     * 获得交易发货设置
     *
     * https://open.youzan.com/api/oauthentry/youzan.logistics.setting/3.0.0/get
     *
     * @return 交易发货设置
     */
    YouzanLogisticsSettingGetResult get();

    /**
     * 设置开关配置
     *
     * https://www.youzanyun.com/apilist/detail/group_trade/logistics/youzan.logistics.setting.update
     *
     * @param shopId 店铺编号
     * @param isExpress 是否支持快递
     * @param calcType 计费类型
     * @param isLocal 是否支持同城
     * @param isSelf 是否支持自提
     * @return 是否成功
     */
    Boolean update(Integer shopId, Boolean isExpress, Integer calcType, Boolean isLocal, Boolean isSelf);

}
