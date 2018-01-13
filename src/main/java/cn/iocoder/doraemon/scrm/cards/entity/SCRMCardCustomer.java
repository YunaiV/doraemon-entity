package cn.iocoder.doraemon.scrm.cards.entity;

public class SCRMCardCustomer {

    /**
     * 用户会员卡编号
     */
    private String id;
    /**
     * 会员卡标识
     */
    private String cardAlias;
    /**
     * 粉丝类型
     *
     * 1：自有粉丝
     */
    private Integer fansType;
    /**
     *【三选一】三方用户ID
     */
    private String openUserId;
    /**
     * 【三选一】手机号
     */
    private String mobile;
    /**
     * 【三选一】粉丝编号
     */
    private Integer fansId;

    // todo 芋艿，有效期开始时间，有效期过期时间
    // todo 芋艿，授权时间
    // todo 芋艿，授权结束时间
}