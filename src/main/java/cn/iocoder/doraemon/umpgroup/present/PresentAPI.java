package cn.iocoder.doraemon.umpgroup.present;

import com.youzan.open.sdk.gen.v3_0_0.model.YouzanUmpPresentGiveResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanUmpPresentsOngoingAllResult;

import java.util.List;

/**
 * 赠品 API
 */
public interface PresentAPI {

    /**
     * 获取所有进行中的赠品列表
     *
     * https://www.youzanyun.com/apilist/detail/group_ump/coupon_advanced/youzan.ump.presents.ongoing.all
     *
     * @param fields 需要返回的赠品对象字段。可选值：赠品结构体中所有字段均可返回；多个字段用“,”分隔。如果为空则返回所有
     * @return 赠品列表
     */
    List<YouzanUmpPresentsOngoingAllResult.UmpPresent> ongoingList(String... fields);

    /**
     * 给用户赠送赠品
     *
     * https://www.youzanyun.com/apilist/detail/group_ump/coupon_advanced/youzan.ump.present.give
     *
     * @param fansId 微信粉丝ID
     * @param buyerId 有赞手机注册用户ID
     * @param presentId 赠品编号
     * @return 赠送结果
     */
    YouzanUmpPresentGiveResult give(Integer fansId, Integer buyerId, Integer presentId);

}