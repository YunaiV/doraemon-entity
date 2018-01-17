package cn.iocoder.doraemon.itemgroup.item;

import com.youzan.open.sdk.gen.v3_0_0.model.YouzanItemQuantityUpdateResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanSkusCustomGetResult;

import java.util.List;

// TODO 芋艿，https://open.youzan.com/api/oauthentry/youzan.item.sku/3.0.0/get 不存在
public interface ItemSkuAPI {

    /**
     * 跟据商家编码（商家为sku设置的外部编号）获取商品sku.
     *
     * https://www.youzanyun.com/apilist/detail/group_item/item/youzan.skus.custom.get
     *
     * importance 注意，如果一个item_no对应多个sku会返回所有符合条件的sku
     *
     * @param itemId 商品Id
     * @param itemNo 商家编码（商家为Sku设置的外部编号）
     * @return 商品sku 数组
     */
    List<YouzanSkusCustomGetResult.ItemSku> customGet(Integer itemId, String itemNo);

    /**
     * 更新SKU
     *
     * https://www.youzanyun.com/apilist/detail/group_item/item/youzan.item.sku.update
     *
     * @param itemId sku id
     * @param skuId 商品数字编号
     * @param quantity sku库存数量
     * @param price sku销售价格，单位：分
     * @param itemNo 商家编码（商家为sku设置外部编号）
     * @return 是否成功; 成功:true
     */
    Boolean update(Integer itemId, Integer skuId, Integer quantity, Integer price, String itemNo);

    /**
     * 支持全量或增量方式更新SKU库存
     *
     * https://www.youzanyun.com/apilist/detail/group_item/item/youzan.item.quantity.update
     *
     * @param type 库存更新方式
     *             0 - 全量更新（默认）
     *             1 - 增量更新
     * @param itemId sku id
     * @param skuId 商品数字编号
     * @param quantity sku库存数量
     * @return 是否成功; 成功:true
     */
    YouzanItemQuantityUpdateResult updateQuantity(Integer type, Integer itemId, Integer skuId, Integer quantity);

}