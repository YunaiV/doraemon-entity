package cn.iocoder.doraemon.itemgroup.item.entity.vo;

/**
 * 商品页面模板商品列表元素 VO
 */
public class ItemTemplateGoodsListElementVO extends AbstractItemTemplateElementVO {

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

    }

    private static final String TYPE = "goods_list";

    /**
     * 展示商品分组的商品数量
     */
    private Integer goodsNumberType;
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
     * 是否显示商品标题
     *
     * 0-不显示
     * 1-显示
     */
    private Integer title;
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
    /**
     * 商品分组数组
     *
     * JSON 格式，数组，每个元素为 {@link GoodsTagElementVO}
     */
    private String goods;

//    private Integer showWishBtn; 0 暂时没找到对应的选项
//
//    private Integer wishBtnType; 1 暂时没找到对应的选项


}
