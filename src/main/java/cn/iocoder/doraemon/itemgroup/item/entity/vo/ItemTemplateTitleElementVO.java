package cn.iocoder.doraemon.itemgroup.item.entity.vo;

import java.util.Date;

/**
 * 商品页面模板标题元素 VO
 */
public class ItemTemplateTitleElementVO extends AbstractItemTemplateElementVO {

    /**
     * 商品页面模板标题元素的选项 VO
     */
    public static class SelectionElementVO extends AbstractItemTemplateElementVO {

        private static final String TYPE = "title_nav_selection";

        // === 标题 ===
        /**
         * 标题
         */
        private String title;

        // === 链接 ===
        /**
         * 链接类型
         */
        private String linkType;
        /**
         * 链接地址
         */
        private String linkURL;
        /**
         * 链接标题
         *
         * 例如链接类型为 goods ，对应商品标题
         */
        private String linkTitle;
        /**
         * 链接编号
         *
         * 例如链接类型为 goods ，对应商品编号
         */
        private String linkId;
        /**
         * 链接别名
         *
         * 例如链接类型为 goods ，对应商品别名
         */
        private String alias;

    }

    /**
     * wx 链接，当 {@link #wxTitleLinkType} 为其他链接类型时使用
     */
    public static class WxLinkVO {

        // === 链接 ===
        /**
         * 链接类型
         */
        private String linkType;
        /**
         * 链接地址
         */
        private String linkURL;
        /**
         * 链接标题
         *
         * 例如链接类型为 goods ，对应商品标题
         */
        private String linkTitle;
        /**
         * 链接编号
         *
         * 例如链接类型为 goods ，对应商品编号
         */
        private String linkId;

    }

    private static final String TYPE = "title";

    /**
     * 标题模板
     *
     * 1-传统样式
     *    使用 {@link #subEntrys} 字段
     * 2-模仿微信图文页样式
     *    使用 "wx_" 前缀的字段们
     */
    private Integer titleTemplate;
    /**
     * 标题名
     */
    private String title;
    /**
     * 副标题
     */
    private String subTitile;
    /**
     * 展示方式
     *
     * 0-居左显示
     * 1-居中显示
     * 2-居右显示
     */
    private Integer showMethod;
    /**
     * 背景色
     */
    private String color;
    /**
     * 选项元素数组
     *
     * JSON 格式，数组，每个元素为 {@link SelectionElementVO} 的实现类字符串
     */
    private String subEntrys;
    /**
     * wx 作者
     */
    private String wxTitleAuthor;
    /**
     * wx 日期
     */
    private Date wxTitleDate;
    /**
     * wx 链接标题
     */
    private String wxTitleLink;
    /**
     * wx 标题链接类型
     *
     * 0-引导关注
     * 1-其他链接
     */
    private Integer wxTitleLinkType;
    /**
     * wx 链接
     */
    private WxLinkVO wxLink;

}
