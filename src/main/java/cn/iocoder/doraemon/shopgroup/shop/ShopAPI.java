package cn.iocoder.doraemon.shopgroup.shop;

import com.youzan.open.sdk.gen.v3_0_0.model.YouzanShopBasicGetResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanShopGetResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanShopStatusGetResult;

public interface ShopAPI {

    /**
     * 创建店铺
     *
     * https://www.youzanyun.com/apilist/detail/group_shop/shop_advanced/youzan.shop.create
     *
     * @param name 店铺名字
     * @param logo 店铺LOGO资源地址
     * @param intro 店铺简介
     * @return 店铺编号
     */
    Integer create(String name, String logo, String intro);

    /**
     * 更新店铺信息
     *
     * https://www.youzanyun.com/apilist/detail/group_shop/shop_advanced/youzan.shop.update
     *
     * @param id 店铺编号
     * @param name 店铺名字
     * @param logo 店铺LOGO资源地址
     * @param intro 店铺简介
     * @return 是否成功
     */
    Boolean update(Integer id, String name, String logo, String intro);

    /**
     * 获取店铺基础信息
     *
     * https://open.youzan.com/api/oauthentry/youzan.shop/3.0.0/get
     *
     * @param id 店铺编号
     * @return 店铺基础信息
     */
    YouzanShopGetResult get(Integer id);

    /**
     * 获取店铺基本信息
     *
     * https://www.youzanyun.com/apilist/detail/group_shop/shop/youzan.shop.basic.get
     *
     * @param id 店铺编号
     * @return 获取店铺基本信息。相比 {@link #get(Integer)} 接口，多了 physical_url 和 cert_type 返回值
     */
    YouzanShopBasicGetResult getBasic(Integer id);

    /**
     * 获取店铺状态信息
     *
     * https://www.youzanyun.com/apilist/detail/group_shop/shop/youzan.shop.status.get
     *
     * @param id 店铺编号
     * @param fields 需要返回的店铺状态信息对象字段
     * @return 店铺状态信息
     */
    YouzanShopStatusGetResult.AccountShopStatus getStatus(Integer id, String[] fields);
}