package cn.iocoder.doraemon.itemgroup.item.entity;

/**
 * Item 购买权限拓展信息
 */
public class ItemPurchaseRight {

    /**
     * Item 编号
     *
     * {@link Item#id}
     */
    private Integer id;
    /**
     * 允许购买的粉丝标签用,号分隔
     *
     * 数组，以逗号分隔
     */
    private String umpTags;
    /**
     * 允许购买的粉丝等级，用逗号分隔
     */
    private String umpLevels;
    /**
     * 每人限购多少件。0代表无限购，默认为0
     */
    private Integer buyQuota;

}