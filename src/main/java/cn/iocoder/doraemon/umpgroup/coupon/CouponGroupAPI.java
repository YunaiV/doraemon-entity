package cn.iocoder.doraemon.umpgroup.coupon;

import cn.iocoder.doraemon.umpgroup.coupon.entity.CouponGroup;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanUmpCouponSearchResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanUmpCouponsUnfinishedSearchResult;

import java.util.List;

/**
 * 优惠劵（码）组 API
 */
public interface CouponGroupAPI {

    /**
     * （分页查询）查询优惠券（码）组列表
     *
     * https://www.youzanyun.com/apilist/detail/group_ump/coupon/youzan.ump.coupon.search
     *
     * @param groupType 类型 PROMOCARD 优惠券，PROMOCODE 优惠码
     * @param status 状态 FUTURE 未开始 ,END 已结束,ON 进行中 （默认查所有状态）
     * @param pageNo 第几页
     * @param pageSize 每页数量
     * @return 优惠券（码）组列表 {@link cn.iocoder.doraemon.umpgroup.coupon.entity.CouponGroup}
     */
    YouzanUmpCouponSearchResult search(String groupType, String status, Integer pageNo, Integer pageSize);

    /**
     * 获取所有未结束的优惠活动列表（包含未开始的、进行中的）
     *
     * https://www.youzanyun.com/apilist/detail/group_ump/coupon/youzan.ump.coupons.unfinished.search
     *
     * @param fields 需要返回的优惠对象字段。可选值：优惠结构体中所有字段均可返回；多个字段用“,”分隔。如果为空则返回所有
     * @return 未结束的优惠券（码）组列表 {@link cn.iocoder.doraemon.umpgroup.coupon.entity.CouponGroup}
     */
    List<YouzanUmpCouponsUnfinishedSearchResult.UmpCoupon> unfinishedSearch(String... fields);

    /**
     * 获取优惠券（码）组详情
     *
     * https://www.youzanyun.com/apilist/detail/group_ump/coupon/youzan.ump.coupon.detail.get
     *
     * @param id 优惠券（码）组编号
     * @return 优惠券（码）组 {@link cn.iocoder.doraemon.umpgroup.coupon.entity.CouponGroup}
     */
    List<CouponGroup> get(Integer id);

}