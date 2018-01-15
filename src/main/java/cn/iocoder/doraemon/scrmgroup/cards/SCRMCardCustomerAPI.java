package cn.iocoder.doraemon.scrmgroup.cards;

import com.youzan.open.sdk.gen.v3_0_0.model.YouzanScrmCustomerCardGrantResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanScrmCustomerInfoGetResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanScrmCustomerSearchResult;

public interface SCRMCardCustomerAPI {

    /**
     * 给用户发放会员卡
     *
     * https://www.youzanyun.com/apilist/detail/group_scrm/crm_advanced/youzan.scrm.customer.card.grant
     *
     * @param fansType 粉丝类型（自有粉丝: fans_type = 1）
     * @param fansId 【三选一】粉丝ID，与 fans_type 同时出现，如果没有写0 mobile/fans_id/open_user_id 三选一传入
     * @param openUserId 【三选一】三方用户ID mobile/fans_id/open_user_id 三选一传入
     * @param mobile 【三选一】手机号，如果没有则写 0 mobile/fans_id/open_user_id 三选一传入
     * @param cardAlias 商家会员卡的唯一标识
     * @return 结果 {
     *     isSuccess: // 是否成功
     *     cardNo : // 用户会员卡号
     * }
     */
    YouzanScrmCustomerCardGrantResult grant(Integer fansType, Integer fansId, String openUserId, String mobile, String cardAlias);

    /**
     * 删除用户的会员卡
     *
     * https://www.youzanyun.com/apilist/detail/group_scrm/crm_advanced/youzan.scrm.customer.card.delete
     *
     * @param fansType 粉丝类型（自有粉丝: fans_type = 1）
     * @param fansId 【三选一】粉丝ID，与 fans_type 同时出现，如果没有写0 mobile/fans_id/open_user_id 三选一传入
     * @param openUserId 【三选一】三方用户ID mobile/fans_id/open_user_id 三选一传入
     * @param mobile 【三选一】手机号，如果没有则写 0 mobile/fans_id/open_user_id 三选一传入
     * @param cardNo 用户会员卡号，没有则写''，与card_alias任选其一，优先级高于card_alias
     * @param cardAlias 商家会员卡唯一标识，没有则写''，与card_no任选其一，优先级低于card_no
     * @return 是否成功
     */
    Boolean delete(Integer fansType, Integer fansId, String openUserId, String mobile, String cardNo, String cardAlias);

    /**
     * 通过用户会员卡号获取会员信息
     *
     * https://www.youzanyun.com/apilist/detail/group_scrm/crm_advanced/youzan.scrm.customer.info.get
     *
     * @param id 用户会员卡卡号
     * @return 用户会员卡信息
     */
    YouzanScrmCustomerInfoGetResult get(String id);

    /**
     * 会员卡对应的会员列表
     *
     * https://www.youzanyun.com/apilist/detail/group_scrm/crm_advanced/youzan.scrm.customer.search
     *
     * @param cardAlias 商家会员卡的唯一标识
     * @param page 每页默认20条，最大支持50页
     * @return 会员列表
     */
    YouzanScrmCustomerSearchResult search(String cardAlias, Integer page);

}