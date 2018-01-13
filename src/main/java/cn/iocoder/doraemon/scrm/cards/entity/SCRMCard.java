package cn.iocoder.doraemon.scrm.cards.entity;

import java.util.Date;

/**
 * 会员卡
 */
public class SCRMCard {

    /**
     * 商家会员卡的唯一标识
     *
     * 例如，https://kdt.im/-28bKh
     */
    private String alias;
    /**
     * 会员卡名，卡名不允许重复，最大字符：9
     */
    private String name;
    /**
     * 会员卡状态
     *
     * 1：正常；
     * 2：已禁用；
     * 3：已删除
     */
    private Integer status;
    /**
     * 发卡链接
     */
    private String url;
    /**
     * 激活方式
     *
     * 0:不需要激活；
     * 1:仅需手机激活；
     * 2:手机+填写资料
     */
    private Integer activateMode;
    /**
     * 卡的类型
     *
     * 1:无门槛卡, （默认值）
     * 2:规则卡;
     */
    private Integer type;
    /**
     * 规则卡的等级,当card_type为2时必填
     */
    private Integer level;
    /**
     * 卡背景颜色
     */
    private String colorCode;
    /**
     * 使用须知
     */
    private String description;

    // todo 芋艿，grant_condition
    // todo 芋艿，rights CardRight[]

    /**
     * 是否允许微信端分享 ，默认允许
     */
    private Boolean isAllowShare;
    /**
     * 客服电话
     */
    private String servicePhone;
    /**
     * 微信卡包的同步设置范围选择：0-3，
     *
     * 0:不同步；
     * 1:基于卡号核销；
     * 2:基于卡号和条形码核销；
     * 3:基于卡号和二维码核销
     */
    private Integer syncWeixinMode;
    /**
     * 同步微信卡状态，
     *
     * 1：不同步；
     * 2：审核中；
     * 3：通过；
     * 4：失败
     */
    private Integer syncWeixinStatus;
    /**
     * 生效方式类型，
     *
     * 1:从领取开始无期限；
     * 2:从固定时刻开始，到固定时刻结束；
     * 3:从领取开始，持续一段时长(termDays)
     */
    private Integer termType;
    /**
     * 生效持续天数，term_type为3时必传
     */
    private Integer termDays;
    /**
     * 生效开始时间
     */
    private Date termStartTime;
    /***
     * 生效结束时间
     */
    private Date termEndTime;
    /**
     * 失效后，默认转变的会员卡，默认不转变
     */
    // todo 芋艿，干啥的
    private String termToCardAlias;
}