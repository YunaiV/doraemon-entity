package cn.iocoder.doraemon.umpgroup.coupon;

import cn.iocoder.doraemon.umpgroup.coupon.entity.Coupon;
import cn.iocoder.doraemon.umpgroup.coupon.entity.CouponGroup;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanUmpPromocodeAddParams;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanUmpPromocodeAddResult;

import java.util.List;

/**
 * 优惠码 API
 */
public interface CouponCodeAPI {

    /**
     * 创建优惠码。
     *
     * 生成 {@link CouponGroup} 和 {@link Coupon}
     *
     * https://www.youzanyun.com/apilist/detail/group_ump/coupon/youzan.ump.promocode.add
     *
     * @param params 优惠码参数
     * @return 优惠码信息 {@link cn.iocoder.doraemon.umpgroup.coupon.entity.Coupon}
     */
    YouzanUmpPromocodeAddResult.UmpPromotionCode add(YouzanUmpPromocodeAddParams params);

    /**
     * 查询买家优惠码列表
     *
     * https://www.youzanyun.com/apilist/detail/group_ump/coupon/youzan.ump.promocode.buyer.search
     *
     * @param fansType 粉丝类型（自有粉丝: fans_type = 1）
     * @param fansId 【三选一】粉丝ID，与 fans_type 同时出现，如果没有写0 mobile/fans_id/open_user_id 三选一传入
     * @param openUserId 【三选一】三方用户ID mobile/fans_id/open_user_id 三选一传入
     * @param mobile 【三选一】手机号，如果没有则写 0 mobile/fans_id/open_user_id 三选一传入
     * @param status 状态。VALID 有效（未使用） USED 已使用 INVALID 已失效
     * @return 优惠码列表 {@link cn.iocoder.doraemon.umpgroup.coupon.entity.Coupon}
     */
    List<Coupon> searchByBuyer(Integer fansType, Integer fansId, String openUserId, String mobile, String status);

    /**
     * 获取优惠码详情
     *
     * https://www.youzanyun.com/apilist/detail/group_ump/coupon/youzan.ump.promocode.detail.get
     *
     * @param id 优惠码编号
     * @return 优惠码 {@link cn.iocoder.doraemon.umpgroup.coupon.entity.Coupon}
     */
    Coupon get(Integer id);

}