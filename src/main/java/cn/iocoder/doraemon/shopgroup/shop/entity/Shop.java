package cn.iocoder.doraemon.shopgroup.shop.entity;

import java.util.Date;

public class Shop {

    /**
     * 店铺编号
     */
    private Integer id;
    /**
     * 店铺LOGO资源地址
     */
    private String logo;
    /**
     * 店铺简介
     */
    private String intro;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 更新时间
     */
    private Date updateTime;

    // todo https://www.youzan.com/v2/setting/store/index#index
    // todo 店铺状态
    // todo 主题信息认证
    // todo 店铺认证
    // todo 联系手机号
    // todo 联系人QQ
}