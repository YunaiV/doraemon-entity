package cn.iocoder.doraemon.umpgroup.counpon;

import cn.iocoder.doraemon.umpgroup.counpon.entity.Coupon;
import cn.iocoder.doraemon.umpgroup.counpon.entity.CouponGroup;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanUmpPromocardAddResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanUmpPromocodeAddParams;

import java.util.List;

/**
 * 优惠劵 API
 */
public interface CouponCardAPI {

    /**
     * 创建优惠劵。
     *
     * 生成 {@link CouponGroup} 和 {@link Coupon}
     *
     * https://www.youzanyun.com/apilist/detail/group_ump/coupon/youzan.ump.promocard.add
     *
     * @param params 优惠劵参数
     * @return 优惠劵信息
     */
    YouzanUmpPromocardAddResult.UmpPromotionCard add(YouzanUmpPromocodeAddParams params);

    /**
     * 查询买家优惠劵列表
     *
     * https://www.youzanyun.com/apilist/detail/group_ump/coupon/youzan.ump.promocard.buyer.search
     *
     * @param fansType 粉丝类型（自有粉丝: fans_type = 1）
     * @param fansId 【三选一】粉丝ID，与 fans_type 同时出现，如果没有写0 mobile/fans_id/open_user_id 三选一传入
     * @param openUserId 【三选一】三方用户ID mobile/fans_id/open_user_id 三选一传入
     * @param mobile 【三选一】手机号，如果没有则写 0 mobile/fans_id/open_user_id 三选一传入
     * @param status 状态。VALID 有效（未使用） USED 已使用 INVALID 已失效
     * @return 优惠劵列表
     */
    List<Coupon> searchByBuyer(Integer fansType, Integer fansId, String openUserId, String mobile, String status);

    /**
     * 获取优惠劵详情
     *
     * https://www.youzanyun.com/apilist/detail/group_ump/coupon/youzan.ump.promocard.detail.get
     *
     * @param id 优惠劵编号
     * @return 优惠劵
     */
    Coupon get(Integer id);

}