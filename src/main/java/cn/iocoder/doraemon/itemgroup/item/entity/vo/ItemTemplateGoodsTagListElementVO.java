package cn.iocoder.doraemon.itemgroup.item.entity.vo;

/**
 * 商品页面模板商品分组元素 VO 的第一种
 */
public class ItemTemplateGoodsTagListElementVO {

    /**
     * 商品列表元素的选项 VO
     */
    public static class GoodsTagElementVO extends AbstractItemTemplateElementVO {

        private static final String TYPE = "tag";

        /**
         * 商品分组编号
         */
        private Integer id;
        /**
         * 商品分组标题
         */
        private String title;
        /**
         * 商品分组访问地址
         */
        private String url;
        /**
         * 展示商品分组的商品数量
         */
        private Integer goodsNumber;

        //  其他商品分组相关冗余字段
    }

    private static final String TYPE = "tag_list";

    /**
     * 商品分组数组
     *
     * JSON 格式，数组，每个元素为 {@link GoodsTagElementVO}
     */
    private String goods;

}
