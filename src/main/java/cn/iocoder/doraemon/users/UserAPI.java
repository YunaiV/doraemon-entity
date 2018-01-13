package cn.iocoder.doraemon.users;

import com.youzan.open.sdk.gen.v3_0_0.model.YouzanUserBasicGetResult;
import com.youzan.open.sdk.gen.v3_1_0.model.YouzanScrmCustomerGetResult;

public interface UserAPI {

    class Account {
        /**
         * 帐号ID
         */
        private String accountId;
        /**
         * 帐号类型。目前支持以下选项（只支持传一种）：
         *
         * FansID：自有粉丝ID
         * Mobile：手机号
         * YouZanAccount：有赞账号
         */
        private String accountType;
    }

    /**
     * 获取用户详情
     *
     * https://www.youzanyun.com/apilist/detail/group_scrm/user/youzan.scrm.customer.get
     *
     * @param account 用户帐号信息
     * @return 客户详情
     */
    YouzanScrmCustomerGetResult get(Account account);

    /**
     * 获取用户简要信息
     *
     * https://www.youzanyun.com/apilist/detail/group_scrm/user/youzan.user.basic.get
     *
     * TODO：参数，等待开发完成，提供 Demo
     *
     * @return 用户简要信息
     */
    YouzanUserBasicGetResult get();

    /**
     * 客户创建接口
     *
     * @param mobile 手机号
     * @param customerCreate 创建客户所需信息 JSON {
     *                          birthday: // 生日
     *                          gender: // 性别
     *                          name: // 姓名
     *                          contact_address: // 地址 JSON 结构
     *                       }
     * @return 用户帐号信息
     */
    Account create(String mobile, String customerCreate);

    /**
     * 客户更新接口
     *
     * @param account 用户帐号信息
     * @param customerUpdate JSON {
     *                          birthday: // 生日
     *                          gender: // 性别
     *                          name: // 姓名
     *                          contact_address: // 地址 JSON 结构
     *                       }
     * @return 是否更新成功
     */
    Boolean update(Account account, String customerUpdate);

}
