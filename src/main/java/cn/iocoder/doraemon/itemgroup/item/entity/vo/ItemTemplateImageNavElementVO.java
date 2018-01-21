package cn.iocoder.doraemon.itemgroup.item.entity.vo;

/**
 * 商品页面模板图片导航元素 VO
 */
public class ItemTemplateImageNavElementVO {

    /**
     * 商品页面模板图片导航元素的选项 VO
     */
    public static class SelectionElementVO extends AbstractItemTemplateElementVO {

        private static final String TYPE = "nav_selection";

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

    private static final String TYPE = "nav";

    /**
     * 选项元素数组
     *
     * JSON 格式，数组，每个元素为 {@link ItemTemplateTextNavElementVO.SelectionElementVO} 的实现类字符串
     */
    private String subEntrys;

}
