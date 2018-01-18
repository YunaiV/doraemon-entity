package cn.iocoder.doraemon.itemgroup.item;

import com.youzan.open.sdk.gen.v3_0_0.api.YouzanItemsCustomGet;
import com.youzan.open.sdk.gen.v3_0_0.model.*;


public interface ItemAPI {

    /**
     * 新增商品
     *
     * https://www.youzanyun.com/apilist/detail/group_item/item/youzan.item.create
     *
     * @param params 新增商品的信息
     * @return 创建成功后的商品详情
     */
    YouzanItemCreateResult.ItemDetailOpenModel create(YouzanItemCreateParams params);

    /**
     * 更新商品
     *
     * https://www.youzanyun.com/apilist/detail/group_item/item/youzan.item.update
     *
     * @param params 更新商品的信息
     * @return {
     *     item_id: // 被更新的商品id
     *     is_success: // 是否操作成功，成功为true
     * }
     */
    YouzanItemUpdateResult update(YouzanItemUpdateParams params);

    /**
     * 批量上架商品
     *
     * https://open.youzan.com/api/oauthentry/youzan.items.update/3.0.0/listing
     *
     * @param itemIds 商品数字编号数组
     * @return 是否成功
     */
    Boolean updateListing(Integer[] itemIds);

    /**
     * 批量下架商品
     *
     * https://open.youzan.com/api/oauthentry/youzan.items.update/3.0.0/listing
     *
     * @param itemIds 商品数字编号数组
     * @return 是否成功
     */
    Boolean updatedeListing(Integer[] itemIds);

    /**
     * 上架商品
     *
     * https://open.youzan.com/api/oauthentry/youzan.item.update/3.0.0/listing
     *
     * @param itemId 商品数字编号
     * @return 是否成功
     */
    Boolean updateListing(Integer itemId);

    /**
     * 下架商品
     *
     * https://www.youzanyun.com/apilist/detail/group_item/item/youzan.item.update.delisting
     *
     * @param itemId 商品数字编号
     * @return 是否成功
     */
    Boolean updateDelisting(Integer itemId);

    /**
     * 根据商品Id删除商品
     *
     * https://www.youzanyun.com/apilist/detail/group_item/item/youzan.item.delete
     *
     * @param itemId 商品Id
     * @return {
     *     item_id: // 被删除的商品id
     *     is_success: // 是否操作成功，成功为true
     * }
     */
    YouzanItemDeleteResult delete(Integer itemId);

    /**
     * 获取单个商品信息
     *
     * @param itemId 商品Id
     * @param alias 商品别名
     * @return 商品信息
     */
    YouzanItemGetResult.ItemDetailOpenModel get(Integer itemId, String alias);

    /**
     * 根据商家编码查询商品
     *
     * https://www.youzanyun.com/apilist/detail/group_item/item/youzan.items.custom.get
     *
     * @param itemNo 商家编码
     * @return {
     *     items: // ItemListOpenModel[],搜索到的商品列表
     *     count：// 商品总数量
     * }
     */
    YouzanItemsCustomGet get(String itemNo);

    /**
     * 分页查询商品标准列表，主要是根据商品类型和商品编码
     *
     * @param itemType 商品类型
     * @param codes 商品编码列表，必传。TODO 芋艿，一直搜不出数据啊！！
     * @return {
     *     count: // 查询到的商品标准数量
     *     item_standards: // ItemStandardOpenModel[] 查询到的商品标准列表
     * }
     */
    YouzanItemStandardSearchResult search(Integer itemType, String[] codes);

    /**
     * 获取仓库中的商品列表
     *
     * https://www.youzanyun.com/apilist/detail/group_item/item/youzan.items.inventory.get
     *
     * @param updateTimeStart 商品起始更新时间，单位ms
     * @param updateTimeEnd 商品终止更新时间，单位ms
     * @param tagId 商品标签的ID
     * @param q 搜索字段。搜索商品的title
     * @param banner
     * @param orderBy 排序方式。格式为column:asc/desc，目前排序字段：
     *                1.创建时间：created_time，
     *                2.更新时间：update_time，
     *                3.价格：price，
     *                4.销量：sold_num
     * @param pageNo 页码
     * @param pageSize 每页条数，最大支持300
     * @return {
     *     count: // 搜索到的商品数量
     *     items: // ItemListOpenModel[] 搜索到的商品列表
     * }
     */
    YouzanItemsInventoryGetResult inventoryGets(Long updateTimeStart, Long updateTimeEnd, Integer tagId,
                                                String q, String banner, String orderBy,
                                                Integer pageNo, Integer pageSize);

    /**
     * 获取出售中的商品列表
     *
     * https://www.youzanyun.com/apilist/detail/group_item/item/youzan.items.onsale.get
     *
     * @param updateTimeStart 商品起始更新时间，单位ms
     * @param updateTimeEnd 商品终止更新时间，单位ms
     * @param tagId 商品标签的ID
     * @param q 搜索字段。搜索商品的title
     * @param orderBy 排序方式。格式为column:asc/desc，目前排序字段：
     *                1.创建时间：created_time，
     *                2.更新时间：update_time，
     *                3.价格：price，
     *                4.销量：sold_num
     * @param pageNo 页码
     * @param pageSize 每页条数，最大支持300
     * @return {
     *     count: // 搜索到的商品数量
     *     items: // ItemListOpenModel[] 搜索到的商品列表
     * }
     */
    YouzanItemsOnsaleGetResult onlineGets(Long updateTimeStart, Long updateTimeEnd, Integer tagId,
                                                String q, String orderBy,
                                                Integer pageNo, Integer pageSize);
}