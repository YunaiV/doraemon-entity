package cn.iocoder.doraemon.itemgroup.item.entity.vo;

/**
 * 商品页面模板橱窗元素 VO
 */
public class ItemTemplateShowCaseElementVO {

    /**
     * 商品页面模板图片广告元素的选项 VO
     */
    public static class SelectionElementVO extends AbstractItemTemplateElementVO {

        private static final String TYPE = "image_ad_selection";

        // === 图片 ===
        /**
         * 图片编号
         */
        private Integer imageId;
        /**
         * 图片地址
         */
        private String imageURL;
        /**
         * 图片缩略地址
         */
        private String imageThumbURL;
        /**
         * 图片高度
         */
        private Integer imageWidth;
        /**
         * 图片宽度
         */
        private Integer imageHeight;

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

    private static final String TYPE = "showcase";

    /**
     * 橱窗标题名
     */
    private String title;
    /**
     * 显示方式
     *
     * 0-保留
     * 1-三列
     */
    private Integer mode;
    /**
     * 图片间隙
     *
     * 0-保留
     * 1-消除
     */
    private Integer withoutSpace;
    /**
     * 内容区标题
     */
    private String bodyTitle;
    /**
     * 内容区说明
     */
    private String bodyDesc;
    /**
     * 选项元素数组
     *
     * JSON 格式，数组，每个元素为 {@link SelectionElementVO}
     */
    private String subEntrys;

}
