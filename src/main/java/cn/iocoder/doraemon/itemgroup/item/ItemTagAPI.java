package cn.iocoder.doraemon.itemgroup.item;

import com.youzan.open.sdk.gen.v3_0_0.model.YouzanItemcategoriesTagAddResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanItemcategoriesTaglistSearchResult;
import com.youzan.open.sdk.gen.v3_0_0.model.YouzanItemcategoriesTagsGetResult;

import java.util.List;

/**
 * 商品分组 API
 */
public interface ItemTagAPI {

    // 获得单条商品分组

    /**
     * 分页获取商品分组列表
     *
     * https://www.youzanyun.com/apilist/detail/group_item/item_category/youzan.itemcategories.taglist.search
     *
     * @param orderBy 排序方式。格式为column:asc/desc，column可选值：created 创建时间
     * @param pageNo 页码
     * @param pageSize 每页条数
     * @return 分组列表
     */
    YouzanItemcategoriesTaglistSearchResult search(String orderBy, Integer pageNo, Integer pageSize);

    /**
     * 根据是否排序查询商品分组列表
     *
     * https://www.youzanyun.com/apilist/detail/group_item/item_category/youzan.itemcategories.tags.get
     *
     * @param isSort 是否排序
     * @return 分组列表信息
     */
    List<YouzanItemcategoriesTagsGetResult.ItemGroupOpenModel> list(Boolean isSort);

    /**
     * 新增一个商品分组
     *
     * https://www.youzanyun.com/apilist/detail/group_item/item_category/youzan.itemcategories.tag.add
     *
     * @param name 商品分组的名称
     * @return 商品分组信息
     */
    YouzanItemcategoriesTagAddResult add(String name);

    /**
     * 更新一个商品分组名
     *
     * https://www.youzanyun.com/apilist/detail/group_item/item_category/youzan.itemcategories.tag.update
     *
     * @param tagId 商品分组编号
     * @param name 商品分组的名称
     * @return 是否成功
     */
    Boolean update(String tagId, String name);

    /**
     * 删除一个商品分组
     *
     * https://www.youzanyun.com/apilist/detail/group_item/item_category/youzan.itemcategories.tag.delete
     *
     * @param tagId 商品分组编号
     * @return 是否成功
     */
    Boolean delete(String tagId);

}
