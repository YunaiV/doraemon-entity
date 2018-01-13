package cn.iocoder.doraemon.scrm.users.entity;

public class UserWeiXinFollower {

    /**
     * 编号
     */
    private Integer id;
    /**
     * 微信粉丝用户的 openid
     */
    private String openId;


    // todo 芋艿,微信粉丝用户ID https://www.youzanyun.com/apilist/structparam/response/CrmWeixinFans
    private Integer userId;

    /**
     * 微信粉丝用户的昵称
     */
    private String nick;
    /**
     * 微信粉丝用户的头像Url
     */
    private String avatar;
    /**
     * 性别。
     *
     * 可选值：m(男)，f(女)。
     * 未知则为空
     */
    private String sex;
    /**
     * 省份
     */
    private String province;
    /**
     * 城市
     */
    private String city;
    /**
     * 是否关注
     */
    private Boolean isFollow;

    // todo 芋艿，当前积分
    private Integer points;

    // todo 芋艿，成交订单笔数
    private Integer tradedNum;

    // todo 芋艿，成交订单总额。单位：元 double => int
    private Double tradedMoney;

    // todo 芋艿，CrmUserTag[]

    // todo 芋艿，CrmFansLevel

}
