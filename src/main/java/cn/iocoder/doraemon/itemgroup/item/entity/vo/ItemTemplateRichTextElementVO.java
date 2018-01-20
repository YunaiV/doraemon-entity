package cn.iocoder.doraemon.itemgroup.item.entity.vo;

/**
 * 商品页面模板富文本元素 VO
 */
public class ItemTemplateRichTextElementVO extends AbstractItemTemplateElementVO {

    private static final String TYPE = "rich_text";

    /**
     * 是否全屏
     */
    private Boolean fullscreen;
    /**
     * 富文本
     */
    private String content;
    /**
     * 背景色
     */
    private String color;

}
