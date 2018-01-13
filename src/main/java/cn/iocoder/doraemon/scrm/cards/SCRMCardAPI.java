package cn.iocoder.doraemon.scrm.cards;

import com.youzan.open.sdk.gen.v3_0_0.model.*;

public interface SCRMCardAPI {

    /**
     * 创建会员卡
     *
     * https://www.youzanyun.com/apilist/detail/group_scrm/crm_advanced/youzan.scrm.card.create
     *
     * @param cardCreate 创建会员卡所需的会员卡信息 https://www.youzanyun.com/apilist/structparam/request/CardCreate
     * @return 会员卡信息
     */
    YouzanScrmCardCreateResult create(YouzanScrmCardCreateParams cardCreate);

    /**
     * 更新会员卡
     *
     * https://www.youzanyun.com/apilist/detail/group_scrm/crm_advanced/youzan.scrm.card.update
     *
     * @param cardUpdate 编辑会员卡所需的会员卡信息 https://www.youzanyun.com/apilist/structparam/request/CardUpdate
     * @return 操作结果
     */
    Boolean update(YouzanScrmCardUpdateParams cardUpdate);

    /**
     * 商家删除会员卡
     *
     * https://www.youzanyun.com/apilist/detail/group_scrm/crm_advanced/youzan.scrm.card.delete
     *
     * @param alias 商家会员卡的唯一标识
     * @return 是否成功
     */
    Boolean delete(String alias);

    /**
     * 商家禁用会员卡
     *
     * https://www.youzanyun.com/apilist/detail/group_scrm/crm_advanced/youzan.scrm.card.disable
     *
     * @param alias 商家会员卡的唯一标识
     * @return 是否成功
     */
    Boolean disable(String alias);

    /**
     * 商家启用会员卡
     *
     * https://www.youzanyun.com/apilist/detail/group_scrm/crm_advanced/youzan.scrm.card.enable
     *
     * @param alias 商家会员卡的唯一标识
     * @return 是否成功
     */
    Boolean enable(String alias);

    /**
     * 获取会员卡链接
     *
     * https://www.youzanyun.com/apilist/detail/group_scrm/crm_advanced/youzan.scrm.card.url.get
     *
     * @param alias 商家会员卡的唯一标识
     * @return 会员卡发卡链接
     */
    String getURL(String alias);

    /**
     * 通过卡id获取卡详情
     *
     * https://www.youzanyun.com/apilist/detail/group_scrm/crm_advanced/youzan.scrm.card.get
     *
     * @param alias 商家会员卡的唯一标识
     * @return 会员卡信息
     */
    YouzanScrmCardGetResult get(String alias);

    /**
     * 获取商家会员卡列表
     *
     * https://www.youzanyun.com/apilist/detail/group_scrm/crm_advanced/youzan.scrm.card.list
     *
     * @param page 页码
     * @return 商家会员卡列表
     */
    YouzanScrmCardListResult list(Integer page);

    // todo 芋艿，到底要不要完整名，字段
}


