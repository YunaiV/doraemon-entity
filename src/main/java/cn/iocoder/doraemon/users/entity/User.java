package cn.iocoder.doraemon.users.entity;

import com.youzan.open.sdk.gen.v3_1_0.model.YouzanScrmCustomerGetResult;

import java.util.Date;

public class User {

    /**
     * 用户ID
     */
    private Long id;
    /**
     * 姓名
     */
    private String name;
    /**
     * 手机号
     */
    private String mobile;
    /**
     * 头像
     */
    private String avatar;
    /**
     * 性别。
     *
     * 0:未知；
     * 1:男；
     * 2:女
     */
    private Integer gender;
    /**
     * 生日
     */
    private Date birthday;
    /**
     * 是否为会员
     */
    private Boolean isMember;
    // TODO 芋艿，等待拆分
    /**
     * 联系地址
     */
    private YouzanScrmCustomerGetResult.ContactAddress contactAddress;

    // TODO openid
    // TODO accountType
    // TODO 或者有个 account 表？

}
