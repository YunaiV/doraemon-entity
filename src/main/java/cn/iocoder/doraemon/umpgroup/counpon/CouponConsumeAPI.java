package cn.iocoder.doraemon.umpgroup.counpon;

import com.youzan.open.sdk.gen.v3_0_0.model.YouzanUmpCouponConsumeGetResult;

/**
 * 优惠劵（码）使用 API
 */
public interface CouponConsumeAPI {

    /**
     * 对优惠券/优惠码进行核销操作
     *
     * https://www.youzanyun.com/apilist/detail/group_ump/coupon/youzan.ump.coupon.consume.verify
     *
     * // TODO 使用优惠劵
     * // TODO 刷卡优惠劵
     *
     * @param code 买家端的优惠券/优惠码核销码
     * @return 是否成功
     */
    Boolean verify(String code);

    // TODO 用户领取
    // TODO 管理员发送
    /**
     * 根据核销码获取优惠券/优惠码
     *
     * https://www.youzanyun.com/apilist/detail/group_ump/coupon/youzan.ump.coupon.consume.get
     *
     * @param code 买家端的优惠券/优惠码核销码
     * @return 核销结构
     */
    YouzanUmpCouponConsumeGetResult get(String code);

}