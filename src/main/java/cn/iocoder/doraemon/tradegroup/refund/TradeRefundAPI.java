package cn.iocoder.doraemon.tradegroup.refund;

import cn.iocoder.doraemon.tradegroup.refund.entity.TradeRefund;
import com.youzan.open.sdk.gen.v3_0_0.model.*;

import java.util.List;

/**
 * TODO
 */
public interface TradeRefundAPI {

    // ======== 退款（买家） BEGIN ========

    /**
     * 退款申请条件信息获取
     *
     * https://www.youzanyun.com/apilist/detail/group_buyer/buyer_refund/youzan.trade.refund.condition.get
     *
     * @param tid 交易编号
     * @param oid 交易明细编号
     * @return 退款条件信息
     */
    YouzanTradeRefundConditionGetResult getCondition(String tid, Integer oid);

    /**
     * 买家申请退款
     *
     * https://www.youzanyun.com/apilist/detail/group_buyer/buyer_refund/youzan.trade.refund.apply
     *
     * 注意：实际从有赞商城页面看到，还有两个字段：
     *  1. 选择退货是，有字段【是否收到货物】
     *  2. 图片举证数组
     *
     * @param tid 交易编号
     * @param oid 交易明细编号
     * @param refundFee 退款金额
     * @param returnItem 是否退货 false(仅退款) true(退货退款)
     * @param mobile 手机号
     * @param reason 退款原因，原因列表地址：https://www.youzanyun.com/docs/guide/faq/699
     * @param desc 退款说明，备注
     * @return 是否成功
     */
    YouzanTradeRefundApplyResult apply(String tid, String oid, Integer refundFee, Boolean returnItem, String mobile,
                                       Integer reason, String desc);

    /**
     * 买家修改申请
     *
     * https://www.youzanyun.com/apilist/detail/group_buyer/buyer_refund/youzan.trade.refund.modify
     *
     * @param refundId 退款ID
     * @param version 版本号，见 {@link TradeRefund#version}
     * @param refundFee 退款金额
     * @param returnItem 是否退货 false(仅退款) true(退货退款)
     * @param reason 退款原因，原因列表地址：https://www.youzanyun.com/docs/guide/faq/699
     * @param desc 退款说明，备注
     * @return 是否成功
     */
    YouzanTradeRefundModifyResult modify(String refundId, Integer version, Integer refundFee, Boolean returnItem,
                                         Integer reason, String desc);

    /**
     * 买家撤销退款申请
     *
     * https://www.youzanyun.com/apilist/detail/group_buyer/buyer_refund/youzan.trade.refund.close
     *
     * @param refundId 退款ID
     * @param version 版本号，见 {@link TradeRefund#version}
     * @return 是否成功
     */
    Boolean close(String refundId, Integer version);

    /**
     * 买家申请客服介入
     *
     * https://www.youzanyun.com/apilist/detail/group_buyer/buyer_refund/youzan.trade.refund.intervene
     *
     * @param refundId 退款ID
     * @param version 版本号，见 {@link TradeRefund#version}
     * @param remark 申请理由
     * @return 是否成功
     */
    Boolean intervene(String refundId, Integer version, String remark);

    // ======== 退款（卖家） BEGIN ========

    /**
     * 商家同意退款
     *
     * https://www.youzanyun.com/apilist/detail/group_trade/trade_advanced/youzan.trade.refund.agree
     *
     * @param refundId 退款ID
     * @param version 版本号，见 {@link TradeRefund#version}
     * @return 是否成功
     */
    Boolean agress(String refundId, Integer version);

    /**
     * 商家拒绝退款
     *
     * https://www.youzanyun.com/apilist/detail/group_trade/trade_advanced/youzan.trade.refund.refuse
     *
     * @param refundId 退款ID
     * @param version 版本号，见 {@link TradeRefund#version}
     * @return 是否成功
     */
    Boolean refuse(String refundId, Integer version);

    /**
     * 查看退款详情
     *
     * https://www.youzanyun.com/apilist/detail/group_trade/trade_advanced/youzan.trade.refund.get
     *
     * @param refundId efundId 退款ID
     * @return 退款详情
     */
    YouzanTradeRefundGetResult get(String refundId);

    // ======== 退货（买家） BEGIN ========

    /**
     * 上传退货物流信息
     *
     * https://www.youzanyun.com/apilist/detail/group_buyer/buyer_refund/youzan.trade.returngoods.fill
     *
     * @param refundId 退款ID
     * @param version 版本号，见 {@link TradeRefund#version}
     * @param expressId 物流公司编号
     * @param nu 物流运单号
     * @return 是否成功
     */
    Boolean fillItem(String refundId, Integer version, Integer expressId, String nu);

    // ======== 退货（卖家） BEGIN ========

    /**
     * 商家同意退货
     *
     * https://www.youzanyun.com/apilist/detail/group_trade/trade_advanced/youzan.trade.returngoods.agree
     *
     * @param refundId 退款编号
     * @param version 版本号，见 {@link TradeRefund#version}
     * @param name 收件人（卖家）名
     * @param mobile 收件人（卖家）手机号
     * @param tel 收件人（卖家）座机
     * @param regionId 收件人（卖家）收获地区编号
     * @param address 收件人（卖家）收获地址
     * @param remark 说明
     * @return 是否成功
     */
    YouzanTradeRefundAgreeResult agree(String refundId, Integer version, String name, String mobile, String tel,
                                       Integer regionId, String address, String remark);

    /**
     * 商家拒绝退货
     *
     * https://www.youzanyun.com/apilist/detail/group_trade/trade_advanced/youzan.trade.returngoods.refuse
     *
     * @param refundId 退款编号
     * @param version 版本号，见 {@link TradeRefund#version}
     * @param remark 说明
     * @return 是否成功
     */
    YouzanTradeRefundRefuseResult refuse(String refundId, Integer version, String remark);

    // ======== 消息（卖家） BEGIN ========

    /**
     * 查看退款操作信息数组
     *
     * https://www.youzanyun.com/apilist/detail/group_trade/trade_advanced/youzan.trade.refund.messages.get
     *
     * @param refundId 退款编号
     * @return 退款操作信息数组
     */
    List<YouzanTradeRefundMessagesGetResult.TradeRefundMessage> messageGets(String refundId);

}