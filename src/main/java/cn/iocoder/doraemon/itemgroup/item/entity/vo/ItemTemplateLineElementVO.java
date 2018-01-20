package cn.iocoder.doraemon.itemgroup.item.entity.vo;

/**
 * 商品页面模板辅助线元素 VO
 */
public class ItemTemplateLineElementVO extends AbstractItemTemplateElementVO {

    private static final String TYPE = "line";

    /**
     * 背景色
     */
    private String color;
    /**
     * 样式
     *
     * solid 实线
     * dashed 虚线
     * dotted 点线
     */
    private String lineType;
    /**
     * 是否左右留白
     */
    private Boolean hasPadding;

}
