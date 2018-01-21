package cn.iocoder.doraemon.itemgroup.item.entity;

import java.util.Date;

/**
 * Item 分组
 */
public class ItemTag {

    /**
     * 编号，自增
     */
    private Integer id;
    /**
     * 别名
     *
     * 系统生成，作为唯一标识。例如，2fpa62tbmsl9h
     */
    private String alias;
    /**
     * 店铺编号
     */
    private Integer shopId;
    /**
     * 名称
     */
    private String title;
    /**
     * 状态
     * 1-正常
     * 2-删除
     */
    private Integer status;
    /**
     * 默认类型
     *
     * 1-其他
     * 2-最新商品 https://help.youzan.com/qa#/menu/2149/detail/1185?_k=825jlx
     * 3-最热商品 https://help.youzan.com/qa#/menu/2149/detail/1185?_k=825jlx
     * 4-列表中隐藏
     */
    private Integer isDefault;
    /**
     * 商品数量
     */
    private Integer itemCount;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 更新时间
     */
    private Date updateTime;
    /**
     * 删除时间
     */
    private Date deleteTime;

}