package cn.iocoder.doraemon.itemgroup.category;

import com.youzan.open.sdk.gen.v3_0_0.model.YouzanItemcategoriesGetResult;

import java.util.List;

/**
 * 商品类目 API
 */
public interface ItemCategoryAPI {

    /**
     * 获取商品类目列表
     *
     * https://www.youzanyun.com/apilist/detail/group_item/item_category/youzan.itemcategories.get
     *
     * @return 商品类目列表
     */
    List<YouzanItemcategoriesGetResult.GoodsCategory> list();

}