package cn.iocoder.doraemon.tradegroup.logistics.entity;

import java.util.Date;

/**
 * 快递订单
 */
public class ExpressOrder {

    /**
     * 事件
     */
    public static class Event {

        /**
         * 时间
         */
        private Date time;
        /**
         * 状态
         *
         * 与 {@link ExpressOrder#status} 一致
         */
        private Integer status;
        /**
         * 上下文
         *
         * 例如，到达：上海静安区公司宝山服务部 由 已签收 签收 || 到达：浙江杭州余杭区良渚公司 已揽件
         */
        private String context;

    }

    /**
     * 快递单号
     */
    private String nu;
    /**
     * 快递公司编号 {@link Express#id}
     */
    private Integer expressId;
    /**
     * 创建时间
     */
    private Date createdTime;
    /**
     * 快递状态
     *
     * 0：在途，即货物处于运输过程中；
     * 1：揽件，货物已由快递公司揽收并且产生了第一条跟踪信息；
     * 2：疑难，货物寄送过程出了问题；
     * 3：签收，收件人已签收；
     * 4：退签，即货物由于用户拒签、超区等原因退回，而且发件人已经签收；
     * 5：派件，即快递正在进行同城派件；
     * 6：退回，货物正处于退回发件人的途中；
     */
    private Integer status;
    /**
     * 过程事件数据
     *
     * 使用 JSON 将 {@link Event}数组 格式化成字符串
     */
    private String data;

}
