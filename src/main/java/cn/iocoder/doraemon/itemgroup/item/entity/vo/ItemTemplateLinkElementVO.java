package cn.iocoder.doraemon.itemgroup.item.entity.vo;

/**
 * 商品页面模板关联链接元素 VO
 */
public class ItemTemplateLinkElementVO extends AbstractItemTemplateElementVO {

    /**
     * 选项 VO
     */
    public static class SelectionVO {

        /**
         * 类型
         *
         * source_selection ：微页面分类 / 商品标签
         * link_selection ：外链
         */
        private String type;

        /**
         * 来源类型
         */
        private String sourceType;
        /**
         * 来源编号
         */
        private Integer sourceId;
        /**
         * 来源标题
         */
        private String sourceTitle;
        /**
         * 来源链接
         */
        private String sourceURL;
        /**
         * 展示来源记录数量，例如，展示商品数量
         */
        private Integer number;
    }

    private static final String TYPE = "link";

    /**
     * 选项元素数组
     *
     * JSON 格式，数组，每个元素为 {@link SelectionVO}
     */
    private String subEntrys;

}
