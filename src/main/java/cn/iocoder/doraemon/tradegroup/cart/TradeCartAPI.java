package cn.iocoder.doraemon.tradegroup.cart;

import com.youzan.open.sdk.gen.v3_0_0.model.YouzanTradeCartListResult;

import java.util.List;

/**
 * 购物车 API
 */
public interface TradeCartAPI {

    /**
     * 添加商品至购物车
     *
     * https://www.youzanyun.com/apilist/detail/group_buyer/buyer_cart/youzan.trade.cart.add
     *
     * @param buyerId 买家编号
     * @param nobody 会话 key
     * @param shopId 店铺编号
     * @param itemId 商品编号
     * @param skuId 商品 SKU 编号
     * @param num 商品数量
     * @param message 购买留言
     * @param activityId 商品营销活动编号
     * @param activityType 商品营销活动类型
     * @param activityAlias TODO 商品活动别名
     * @param bizTracePointExt TODO 扩展字段
     * @return 是否成功
     */
    Boolean add(Integer buyerId, String nobody, Integer shopId,
                Integer itemId, Integer skuId, Integer num, String message,
                Integer activityId, Integer activityType, String activityAlias,
                String bizTracePointExt);

    /**
     * 购物车更新商品数量
     *
     * https://www.youzanyun.com/apilist/detail/group_buyer/buyer_cart/youzan.trade.cart.update
     *
     * @param buyerId 买家编号
     * @param nobody 会话 key
     * @param shopId 店铺编号
     * @param itemId 商品编号
     * @param skuId 商品 SKU 编号
     * @param num 商品数量
     * @return 是否成功
     */
    Boolean update(Integer buyerId, String nobody, Integer shopId,
                   Integer itemId, Integer skuId, Integer num);

    /**
     * 购物车删除商品
     *
     * https://www.youzanyun.com/apilist/detail/group_buyer/buyer_cart/youzan.trade.cart.delete
     *
     * @param buyerId 买家编号
     * @param nobody 会话 key
     * @param shopId 店铺编号
     * @param itemList 商品列表信息 [{
     *                      itemId: // 商品编号
     *                      skuId: // 商品 SKU 编号
     *                  }]
     * @return 是否成功
     */
    Boolean delete(Integer buyerId, String nobody, Integer shopId, String itemList);

    /**
     * 清空购物车
     *
     * https://www.youzanyun.com/apilist/detail/group_buyer/buyer_cart/youzan.trade.cart.empty
     *
     * @param buyerId 买家编号
     * @param nobody 会话 key
     * @param shopId 店铺编号
     * @return 是否成功
     */
    Boolean deleteAll(Integer buyerId, String nobody, Integer shopId);

    /**
     * 查询用户在购物车中的商品数量
     *
     * https://www.youzanyun.com/apilist/detail/group_buyer/buyer_cart/youzan.trade.cart.count
     *
     * @param buyerId 买家编号
     * @param nobody 会话 key
     * @param shopId 店铺编号
     * @return 商品数量
     */
    Integer count(Integer buyerId, String nobody, Integer shopId);

    /**
     * 显示买家购物车中的商品列表
     *
     * https://www.youzanyun.com/apilist/detail/group_buyer/buyer_cart/youzan.trade.cart.list
     *
     * @param buyerId 买家编号
     * @param nobody 会话 key
     * @param shopId 店铺编号
     * @return 购物车中商品列表信息
     */
    List<YouzanTradeCartListResult.CartFormat> list(Integer buyerId, String nobody, Integer shopId);

}

// TODO 芋艿，多网点的影响。