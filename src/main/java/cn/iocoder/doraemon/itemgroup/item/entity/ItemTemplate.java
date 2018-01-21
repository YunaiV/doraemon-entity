package cn.iocoder.doraemon.itemgroup.item.entity;

import cn.iocoder.doraemon.itemgroup.item.entity.vo.AbstractItemTemplateElementVO;

import java.util.Date;

/**
 * 商品页面模板
 *
 * 如何使用商品页模版：https://help.youzan.com/qa#/menu/2111/detail/859?_k=w4e8zz
 */
public class ItemTemplate {

    /**
     * 配置元素 VO
     */
    public static class ConfigElementVO extends AbstractItemTemplateElementVO {

        private static final String TYPE = "config";

        /**
         * 标题
         */
        private String title;
        /**
         * 模板样式
         *
         * 0-普通版
         * 1-普通简洁版
         */
        private Integer templateStyle;

    }

    /**
     * 商品详情区元素 VO
     */
    public static class GoodsTemplateSplitElementVO extends AbstractItemTemplateElementVO {

        private static final String TYPE = "goods_template_split";

    }



    /**
     * 编号 —— 普通版（内置）
     */
    private static final Integer ID_STYLE_1 = - 1;
    /**
     * 编号 —— 普通简洁版（内置）
     */
    private static final Integer ID_SYTLE_2 = -2;

    /**
     * 模板编号
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
     * 标题
     */
    private String title;
    /**
     * 是否展示
     */
    private Boolean isDisplay;
    /**
     * 状态
     *
     * 1-正常
     * 2-删除
     */
    private Integer status;
    /**
     * 模板元素数组
     *
     * JSON 格式，数组，每个元素为 {@link cn.iocoder.doraemon.itemgroup.item.entity.vo.AbstractItemTemplateElementVO} 的实现类字符串
     */
    private String data;
    /**
     * 添加时间
     */
    private Date addTime;
    /**
     * 最后更新时间
     */
    private Date updateTime;
    /**
     * 删除时间
     */
    private Date deleteTime;

}