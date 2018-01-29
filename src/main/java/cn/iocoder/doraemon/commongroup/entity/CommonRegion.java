package cn.iocoder.doraemon.commongroup.entity;

/**
 * 地区
 */
public class CommonRegion {

    /**
     * 地区编号
     */
    private Integer id;
    /**
     * 名字
     */
    private String name;
    /**
     * 级别
     *
     * 1-国家
     * 2-省份
     * 3-城市
     * 4-区县
     * 5-街道
     */
    private Integer level;
    /**
     * 父地区编号
     */
    private Integer parentId;
    /**
     * 拼音
     */
    private String pinyin;

}
