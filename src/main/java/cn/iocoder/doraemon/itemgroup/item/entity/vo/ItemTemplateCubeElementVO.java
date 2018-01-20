package cn.iocoder.doraemon.itemgroup.item.entity.vo;

/**
 * 商品页面模板魔方元素 VO
 */
public class ItemTemplateCubeElementVO extends AbstractItemTemplateElementVO {

    /**
     * 商品页面模板魔方元素的选项 VO
     */
    public static class SelectionElementVO extends AbstractItemTemplateElementVO {

        private static final String TYPE = "cube_selection";

        // === 坐标 ===
        /**
         * x 坐标
         */
        private Integer x;
        /**
         * y 坐标
         */
        private Integer y;
        /**
         * 宽
         */
        private Integer width;
        /**
         * 高
         */
        private Integer height;

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

    private static final String TYPE = "cube2";

    /**
     * 魔方高度
     */
    private Integer layoutHeight;
    /**
     * 魔方宽度
     */
    private Integer layoutWidth;
    /**
     * 选项元素数组
     *
     * JSON 格式，数组，每个元素为 {@link SelectionElementVO}
     */
    private String subEntrys;
    /**
     * 生成的魔方的 HTML 内容
     *
     * 例如：
     * <tr>
     *      <td class="not-empty cols-1 rows-3 " colspan="1" rowspan="3" data-index="0">
     *          <a href="https://h5.youzan.com/v2/showcase/feature?alias=akn9lyHRIy"> <img src="https://img.yzcdn.cn/upload_files/2018/01/17/FvK2lCbM-sk7lPJ57VwVrVb3AYzL.jpeg!730x0.jpg" /> </a>
     *      </td>
     *      <td class="not-empty cols-2 rows-3 " colspan="2" rowspan="3" data-index="1">
     *          <img src="https://img.yzcdn.cn/upload_files/2018/01/17/FvK2lCbM-sk7lPJ57VwVrVb3AYzL.jpeg!730x0.jpg" />
     *      </td>
     *      <td class="not-empty cols-1 rows-3 " colspan="1" rowspan="3" data-index="2">
     *          <img src="https://img.yzcdn.cn/upload_files/2018/01/20/Fv-KKhg4sZ6Rrwve3_jiDVYQdMlO.jpg!730x0.jpg" />
     *      </td>
     * </tr>
     * <tr>
     *      <td id="sbtd" style="display:none;"></td></tr><tr><td id="sbtd" style="display:none;"></td>
     * </tr>
     * <tr>
     *      <td class="empty" data-x="0" data-y="3"></td>
     *      <td class="empty" data-x="1" data-y="3"></td>
     *      <td class="empty" data-x="2" data-y="3"></td><td class="empty" data-x="3" data-y="3"></td>
     * </tr>
     */
    private String tableContent;

}
