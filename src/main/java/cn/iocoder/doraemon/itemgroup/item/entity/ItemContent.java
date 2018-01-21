package cn.iocoder.doraemon.itemgroup.item.entity;

import cn.iocoder.doraemon.itemgroup.item.entity.vo.AbstractItemTemplateElementVO;

/**
 * 商品详情
 */
public class ItemContent {

    /**
     * 配置元素 VO
     */
    public static class ConfigElementVO extends AbstractItemTemplateElementVO {

        private static final String TYPE = "config";

        /**
         * 商品描述
         */
        private String content;

    }

    /**
     * Item 编号
     *
     * {@link Item#id}
     */
    private Integer id;
    /**
     * 商品描述。
     *
     * 字数要大于5个字符，小于25000个字符 ，受违禁词控制
     */
    private String desc;
    /**
     * 商品页模板编号
     */
    private Integer templateId;
    /**
     * 模板元素数组
     *
     * JSON 格式，数组，每个元素为 {@link cn.iocoder.doraemon.itemgroup.item.entity.vo.AbstractItemTemplateElementVO} 的实现类字符串
     */
    private String data;

}