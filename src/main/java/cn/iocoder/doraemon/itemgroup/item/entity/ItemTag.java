package cn.iocoder.doraemon.itemgroup.item.entity;

import cn.iocoder.doraemon.itemgroup.item.entity.vo.AbstractItemTemplateElementVO;

import java.util.Date;

/**
 * Item 分组
 */
public class ItemTag {

    /**
     * 配置元素 VO
     */
    public static class ConfigElementVO extends AbstractItemTemplateElementVO {

        private static final String TYPE = "config";

        /**
         * 分组标题
         */
        private String title;
        /**
         * 是否页面上显示商品分组名称
         *
         * 0-不显示
         * 1-显示
         */
        private Integer showTagTitle;
        /**
         * 第一优先级
         *
         * 0-序号越大越靠前
         * 3-最热的排在前面
         */
        private Integer firstPriority;
        /**
         * 第二优先级
         *
         * 1-创建时间越晚越靠前
         * 2-创建时间越早越靠前
         * 3-最热的排在前面
         */
        private Integer secondPriority;
        /**
         * 富文本编辑器
         */
        private String content;
        /**
         * 列表样式
         *
         * 0-大图
         * 1-小图
         * 2-一大两小
         * 3-详细列表
         */
        private Integer size;
        /**
         * 商品样式
         *
         * 0-卡片样式
         * 1-瀑布流
         * 2-极简样式
         * 3-促销
         */
        private Integer sizeType;
        /**
         * 是否显示购买按钮
         *
         * 0-不显示
         * 1-显示
         */
        private Integer buyBtn;
        /**
         * 显示购买按钮的样式
         *
         * 1-样式1
         * 2-样式2
         * 3-样式3
         * 4-样式4
         */
        private Integer buyBtnType;
        /**
         * 显示购物车图标
         *
         * 0-不显示
         * 1-显示
         */
        private Integer cart;
        /**
         * 是否显示商品标题
         *
         * 0-不显示
         * 1-显示
         */
        private Integer showTitle;
        /**
         * 是否显示商品简介
         *
         * 0-不显示
         * 1-显示
         */
        private Integer showSubTitle;
        /**
         * 是否显示商品价格
         *
         * 0-不显示
         * 1-显示
         */
        private Integer price;

    }

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
     * 0-商家自定义
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
     * 模板元素数组
     *
     * JSON 格式，数组，每个元素为 {@link cn.iocoder.doraemon.itemgroup.item.entity.vo.AbstractItemTemplateElementVO} 的实现类字符串
     */
    private String data;
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