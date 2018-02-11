package cn.iocoder.doraemon.itemgroup.item.entity;

import java.util.Date;

/**
 * Item 预售扩展信息
 */
public class ItemEtd {

    /**
     * Item 编号
     *
     * {@link Item#id}
     */
    private Integer id;
    /**
     * 发货类型
     *
     * 0 - xxx 时间开始发货
     * 1 - 付款 n 天后发货。
     */
    private Integer etdType;
    /**
     * 预计发货开始时间, 字符串格式的时间，格式如：2018-01-01
     */
    private Date etdStartDate;
    /**
     * 付款成功 后发货天数, 默认0
     */
    private Integer etdDays;

}
