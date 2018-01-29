package cn.iocoder.doraemon.commongroup;

import com.youzan.open.sdk.gen.v3_0_0.model.YouzanRegionsGetResult;

import java.util.List;

/**
 * 地区 API
 */
public interface CommonRegoinAPI {

    /**
     * 获取区域地名列表信息
     *
     * https://www.youzanyun.com/apilist/detail/group_trade/logistics/youzan.regions.get
     *
     * @param id 区域ID
     * @param parentId 区域父级ID
     * @param level 要获取的区域等级
     * @param fields 需要返回的区域地名对象字段
     * @return 区域地名列表信息
     */
    List<YouzanRegionsGetResult.CommonRegion> gets(Integer id, Integer parentId, Integer level, String[] fields);

}