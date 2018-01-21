package cn.iocoder.doraemon.itemgroup.item;

import com.youzan.open.sdk.gen.v3_0_0.model.YouzanItemTemplateListSearchResult;

public interface ItemTemplateAPI {

    /**
     * 查询店铺下所有的详情模板列表
     *
     * https://open.youzan.com/api/oauthentry/youzan.item.template.list/3.0.0/search
     *
     * @param pageNo 页码
     * @param pageSize 每页大小
     * @return 商品详情模板( ItemDetailTempOpenModel )数组
     */
    YouzanItemTemplateListSearchResult search(Integer pageNo, Integer pageSize);

}
