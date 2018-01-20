package cn.iocoder.doraemon.itemgroup.item.entity.vo;

/**
 * 商品页面模板文本导航元素 VO
 */
public class ItemTemplateTextNavElementVO extends AbstractItemTemplateElementVO {

    /**
     * 商品页面模板文本导航元素的选项 VO
     */
    public static class SelectionElementVO extends AbstractItemTemplateElementVO {

        private static final String TYPE = "text_nav_selection";

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

    private static final String TYPE = "text_nav";

    /**
     * 展示方式
     *
     * 0-默认（目前就这一种）
     */
    private Integer showMethod;
    /**
     * 选项元素数组
     *
     * JSON 格式，数组，每个元素为 {@link SelectionElementVO} 的实现类字符串
     */
    private String subEntrys;

}
