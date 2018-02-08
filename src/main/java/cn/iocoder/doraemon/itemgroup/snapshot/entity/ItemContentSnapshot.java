package cn.iocoder.doraemon.itemgroup.snapshot.entity;

import java.util.Date;

/**
 * 商品详情，对应 {@link cn.iocoder.doraemon.itemgroup.item.entity.ItemContent} 实体。
 */
public class ItemContentSnapshot {

    /**
     * 快照编号 {@link ItemSnapshot#id}
     */
    private Integer id;
    /**
     * 商品编号
     *
     * {@link cn.iocoder.doraemon.itemgroup.item.entity.Item#id}
     */
    private Integer itemId;
    private String desc;
    private Integer templateId;
    private String data;
    /**
     * 快照时间
     */
    private Date createTime;

}