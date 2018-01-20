package cn.iocoder.doraemon.itemgroup.item.entity.vo;

/**
 * 商品页面模板语音元素 VO
 */
public class ItemTemplateAudioElementVO extends AbstractItemTemplateElementVO {

    private static final String TYPE = "audio";

    /**
     * 样式
     *
     * 0-模仿微信对话样式
     * 1-简易音乐播放器
     */
    private Integer style;
    /**
     * 语音
     */
    private String audio;
    /**
     * 气泡头像
     */
    private String avatar;
    /**
     * 气泡位置
     *
     * 0-居左
     * 1-居右
     */
    private Integer bubble;
    /**
     * 是否循环
     *
     * 0-否
     * 1-是
     */
    private Integer loop;
    /**
     * 播放
     *
     * 0-暂停后再恢复播放时，从头开始
     * 1-暂停后再恢复播放时，从暂停位置开始
     */
    private Integer reload;
    /**
     * 标题
     */
    private String title;

}
