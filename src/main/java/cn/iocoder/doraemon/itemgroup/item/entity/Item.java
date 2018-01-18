package cn.iocoder.doraemon.itemgroup.item.entity;

import java.util.Date;

/**
 * 商品
 */
public class Item {

    /**
     * 编号
     */
    private Integer id;
    /**
     * 别名
     *
     * 系统生成，作为唯一标识。例如，2fpa62tbmsl9h
     */
    private String alias;
    /**
     * 店铺编号
     */
    private Integer shopId;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 更新时间
     */
    private Date updateTime;
    /**
     * 状态
     *
     * 1-正常
     * 2-删除
     */
    private Integer status;

    // ========== 基本信息 BEGIN ==========

    /**
     * 商品标题
     *
     * 不能超过100字，受违禁词控制
     */
    private String title;
    /**
     * 副标题，分享链接时显示
     */
    private String summary;
    /**
     * 商品描述。
     *
     * 字数要大于5个字符，小于25000个字符 ，受违禁词控制
     */
    private String desc;
    /**
     * 商品页模板
     */
    private Integer templateId;
    /**
     * 商品分类的叶子类目编号
     *
     * 有赞——店铺主营类目和商品类目对应表：https://bbs.youzan.com/forum.php?mod=viewthread&tid=25252
     */
    private Integer cid;
    /**
     * 商品主图地址
     *
     * 数组，以逗号分隔
     *
     * 建议尺寸：800*800像素，你可以拖拽图片调整顺序，最多上传15张
     */
    private String picURLs;
    /**
     * 商品类型
     *
     * 0：普通商品（物流发货）
     * 3：UMP降价拍
     * 5：外卖商品
     * 10：分销商品
     * 20：会员卡商品
     * 21：礼品卡商品
     * 22：团购券
     * 25：批发商品
     * 30：收银台商品
     * 31：知识付费商品
     * 35：酒店商品（无需物流）
     * 40：美业商品
     * 60：虚拟商品（无需物流）
     * 61：电子卡券（无需物流）
     */
    private Integer itemType;
    /**
     * 商品类型
     *
     * 0：自营商品
     * 10：分销商品
     */
    private Integer goodsType;
    /**
     * todo 芋艿，
     * 分组列表
     */
    private String tag_ids;
    // TODO 芋艿，GroupOpenModel[] 分组

    // ========== 基本信息 END ==========

    // ========== 价格库存 BEGIN ==========

    /**
     * 价格，单位分
     */
    private Integer price;
    /**
     * 商品重量，没有SKU时用
     */
    private Double itemWeight;
    /**
     * 商品货号（商家为商品设置的外部编号）
     */
    private String itemNo;
    /**
     * 总库存
     *
     * 基于 sku 的库存数量累加
     */
    private Integer quantity;
    /**
     * 总销量
     */
    private Integer soldNum;
    /**
     * 是否隐藏商品库存。在商品展示时不显示商品的库存。
     *
     * 0 - 显示库存（默认）
     * 1 - 不显示库存
     */
    private Integer hideStock;
    /**
     * 商品划线价格，可以自定义。例如 促销价：888
     *
     * 商品没有优惠的情况下，划线价在商品详情会以划线形式显示。
     */
    private Double originPrice;
    /**
     * 是否参加会员折扣。
     *
     * 1 - 参加会员折扣（默认）
     * 0 - 不参加会员折扣
     */
    private Integer joinLevelDiscount;

    // ========== 价格库存 END ==========

    // ========== 运费信息 BEGIN ==========
    /**
     * 运费类型
     */
    private Integer postType;
    /**
     * 运费，单位分
     */
    private Integer postFee;
    /**
     * 运费模版id
     */
    private Integer deliveryTemplateId;
    // ========== 运费信息 END ==========

    // ========== 其他信息 BEGIN ==========

    /**
     * 是否上架商品。
     *
     * true 为已上架
     * false 为已下架
     */
    private Boolean isListing;
    /**
     * 排序字段
     */
    private Integer order;
    /**
     * 开始出售时间。
     *
     * 没设置则为空
     */
    private Date autoListingTime;
    /**
     * 商品是否锁定。TODO 芋艿，哪里使用
     *
     * true 为已锁定
     * false 为未锁定
     */
    private Boolean isLock;
    /**
     * 留言表单数组配置
     *
     * JSON 字符串 [{
     *     name: // 表单名，String
     *     required: // 是否必填，Integer，1-必填；0-选填
     *     type: // 表单类型，String，枚举：文本格式/数字格式/邮件/日期/时间/身份证号/图片
     *     multiple: // 是否多行，Integer，1-多行，0-单行
     *     datetime：// 是否包含日期，用于 `type=时间`
     * }]
     */
    private String messages;

    // ========== 其他信息 END ==========


    /**
     * 是否有预售
     */
    private Boolean etdStatus;
    /**
     * 是否设置商品购买权限
     */
    private Boolean purchaseRightStatus;


    // TODO 跳转到其他网站购买

    // TODO 芋艿，ItemVirtualOpenModel
}
