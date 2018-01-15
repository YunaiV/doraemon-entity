package cn.iocoder.doraemon.shopgroup.address;

import com.youzan.open.sdk.gen.v3_0_0.model.*;

public interface ShopAddressAPI {

    /**
     * 店铺地址库新建一个地址
     *
     * https://www.youzanyun.com/apilist/detail/group_shop/shop/youzan.shop.address.create
     *
     * @param params 参数
     * @return 响应 {
     *     is_success: // 是否成功
     *     id: // 新增的地址id
     * }
     */
    YouzanShopAddressCreateResult create(YouzanShopAddressCreateParams params);

    /**
     * 店铺地址库更新一个地址
     *
     * https://www.youzanyun.com/apilist/detail/group_shop/shop/youzan.shop.address.update
     *
     * @param params 参数
     * @return 是否成功
     */
    Boolean update(YouzanShopAddressUpdateParams params);

    /**
     * 店铺地址库删除一个地址
     *
     * https://open.youzan.com/api/oauthentry/youzan.shop.address/3.0.0/delete
     *
     * @param id 地址id
     * @return 是否成功
     */
    Boolean delete(Integer id);

    /**
     * 店铺地址库获取所有地址
     *
     * https://www.youzanyun.com/apilist/detail/group_shop/shop/youzan.shop.address.list
     *
     * @param type 地址类型
     *                  return(退货地址)
     *                  invoice(发票地址)
     * @return 响应 {
     *     total: // 地址总数
     *     list: // 地址列表
     * }
     */
    YouzanShopAddressListResult list(String type);

    /**
     * 店铺地址库获取一个地址
     *
     * https://www.youzanyun.com/apilist/detail/group_shop/shop/youzan.shop.address.get
     *
     * @param id 地址id
     * @return 地址明细
     */
    YouzanShopAddressGetResult get(Integer id);

}
