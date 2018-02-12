package cn.iocoder.doraemon.umpgroup.coupon;

import com.youzan.open.sdk.gen.v3_0_0.model.YouzanUmpCouponConsumeFetchlogsGetResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanUmpCouponConsumeGetResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanUmpCouponConsumeVerifylogsGetResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanUmpCouponTakeResult;

import java.util.Date;

/**
 * 优惠劵（码）使用 API
 */
public interface CouponConsumeAPI {

    /**
     * 发放优惠券优惠码
     *
     * https://www.youzanyun.com/apilist/detail/group_ump/coupon/youzan.ump.coupon.take
     *
     * @param fansType 粉丝类型（自有粉丝: fans_type = 1）
     * @param fansId 【三选一】粉丝ID，与 fans_type 同时出现，如果没有写0 mobile/fans_id/open_user_id 三选一传入
     * @param openUserId 【三选一】三方用户ID mobile/fans_id/open_user_id 三选一传入
     * @param mobile 【三选一】手机号，如果没有则写 0 mobile/fans_id/open_user_id 三选一传入
     * @param id 优惠券（码）组编号
     * @return 发放优惠劵结果 {@link cn.iocoder.doraemon.umpgroup.coupon.entity.Coupon}
     */
    YouzanUmpCouponTakeResult take(Integer fansType, Integer fansId, String openUserId, String mobile, Integer id);

    /**
     * 对优惠券/优惠码进行核销操作
     *
     * https://www.youzanyun.com/apilist/detail/group_ump/coupon/youzan.ump.coupon.consume.verify
     *
     * @param code 买家端的优惠券/优惠码核销码
     * @return 是否成功
     */
    Boolean verify(String code);

    /**
     * 根据核销码获取优惠券/优惠码
     *
     * https://www.youzanyun.com/apilist/detail/group_ump/coupon/youzan.ump.coupon.consume.get
     *
     * @param code 买家端的优惠券/优惠码核销码
     * @return 核销结构 {@link cn.iocoder.doraemon.umpgroup.coupon.entity.Coupon}
     */
    YouzanUmpCouponConsumeGetResult get(String code);

    /**
     * 获取优惠券/优惠码领取记录
     *
     * https://www.youzanyun.com/apilist/detail/group_ump/coupon/youzan.ump.coupon.consume.fetchlogs.get
     *
     * @param groupId 优惠劵（码）分组编号
     * @param startTakeTime 领取时间（开始时间）
     * @param endTakeTime 领取时间（结束时间）
     * @param pageNo 页码
     * @param pageSize 每页数量
     * @return 领取记录分页 + 领取总数
     */
    YouzanUmpCouponConsumeFetchlogsGetResult getFetchLogs(Integer groupId, Date startTakeTime, Date endTakeTime,
                                                                                     Integer pageNo, Integer pageSize);

    /**
     * 获取优惠券/优惠码核销记录
     *
     * https://www.youzanyun.com/apilist/detail/group_ump/coupon/youzan.ump.coupon.consume.verifylogs.get
     *
     * @param type 类型（优惠劵/优惠码）
     * @param pageNo 页码
     * @param pageSize 每页数量
     * @return 验证记录分页
     */
    YouzanUmpCouponConsumeVerifylogsGetResult getVerifyLogs(Integer type, Integer pageNo, Integer pageSize);

}