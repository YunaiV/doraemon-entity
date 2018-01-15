package cn.iocoder.doraemon.shopgroup.address.entity;

import java.util.Date;

public class ShopAddress {

    /**
     * 地址编号
     */
    private Integer id;
    /**
     * 店铺编号
     */
    private Integer shopId;
    /**
     * 手机
     */
    private String mobile;
    /**
     * 联系人
     */
    private String contactName;
    /**
     * 地区id
     */
    private Integer regionId;
    /**
     * 详细地址
     */
    private String address;
    /**
     * 是否退货地址
     */
    private Boolean isReturn;
    /**
     * 是否默认退货地址
     */
    private Boolean isReturnDefault;
    /**
     * 是否发票地址
     */
    private Boolean isInvoice;
    /**
     * 是否默认发票地址
     */
    private Boolean isInvoiceDefault;
    /**
     * 状态
     *
     * 1：正常
     * 2：删除
     */
    private Integer status;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 删除时间
     */
    private Date deleteTime;
    /**
     * 更新时间
     */
    private Date updateTime;
}
