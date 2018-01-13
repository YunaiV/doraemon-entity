package cn.iocoder.doraemon.scrm.users;

import com.youzan.open.sdk.gen.v3_0_0.model.*;

import java.util.Date;
import java.util.List;

public interface UserWeiXinAPI {

    /**
     * 使用手机号获取用户openId
     *
     * https://www.youzanyun.com/apilist/detail/group_scrm/user/youzan.user.weixin.openid.get
     *
     * @param mobile 手机号
     * @param countryCode 手机号国际码
     * @return 用户 openId
     */
    String openIdGet(String mobile, String countryCode);

    /**
     * 根据微信粉丝用户的 openid 或 fans_id 获取用户信息
     *
     * https://www.youzanyun.com/apilist/detail/group_scrm/user/youzan.users.weixin.follower.get
     *
     * @param weixinOpenid 微信粉丝用户的openid
     * @param fansId 微信粉丝用户ID。 调用时，参数 weixin_openid 和 fans_id 选其一即可
     * @param fields 需要返回的微信粉丝对象字段，如nick,avatar等。
     *               可选值：CrmWeixinFans微信粉丝结构体中所有字段均可返回；多个字段用“,”分隔。
     *               如果为空则返回所有
     * @return 微信粉丝用户信息
     * // todo 芋艿，fans_id 和 user_id 的关系
     */
    YouzanUsersWeixinFollowerGetResult.CrmWeixinFans followerGet(String weixinOpenid, Integer fansId, String[] fields);

    /**
     * 根据多个微信粉丝用户的 openid 或 user_id 获取用户信息
     *
     * https://www.youzanyun.com/apilist/detail/group_scrm/user/youzan.users.weixin.follower.gets
     *
     * @param weixinOpenids 微信粉丝用户的openid，多个用逗号分隔
     * @param fansIds 微信粉丝用户ID，多个用逗号分隔。调用时，参数 weixin_openids 和 fans_ids 选其一即可
     * @param pageNo 页码
     * @param pageSize 每页条数，默认值：40，最大值：500
     * @param fields 需要返回的微信粉丝对象字段，如nick,avatar等。
     *               可选值：CrmWeixinFans微信粉丝结构体中所有字段均可返回；多个字段用“,”分隔。
     *               如果为空则返回所有
     * @return 微信粉丝用户信息列表
     */
    List<YouzanUsersWeixinFollowerGetResult.CrmWeixinFans> followerGets(String[] weixinOpenids, Integer[] fansIds, Integer pageNo, Integer pageSize, String[] fields);

    /**
     * 查询微信粉丝用户信息
     *
     * https://www.youzanyun.com/apilist/detail/group_scrm/user/youzan.users.weixin.followers.info.search
     *
     * 与该接口相同：https://www.youzanyun.com/apilist/detail/group_scrm/user/youzan.users.weixin.followers.get 【即将废弃】
     *
     * @param startFollow 关注的起始时间。
     *                    查询在该时间之后（包含该时间）关注的粉丝，不能为空。格式可为“20170101”或“2017-01-01 12:00:00"
     * @param endFollow 关注的结束时间。
     *                  查询在该时间之前关注的粉丝，不能为空，查询时间间隔不能超过一天，格式同start_follow
     * @param onlyFollow 是否仅拉取关注的粉丝。
     *                   1:仅拉取已关注的粉丝
     *                   0:拉取已关注和已跑路粉丝
     * @param pageNo 页码
     * @param pageSize 每页条数，默认值：40，最大值：500
     * @param fields 需要返回的微信粉丝对象字段，如nick,avatar等。
     *               可选值：CrmWeixinFans微信粉丝结构体中所有字段均可返回；多个字段用“,”分隔。
     *               如果为空则返回所有
     * @return {
     *     total_results: // 搜索到的微信粉丝用户总数
     *     users: // 【CrmWeixinFans】 搜索到的微信粉丝用户列表
     * }
     */
    YouzanUsersWeixinFollowersInfoSearchResult followerSearch(Date startFollow, Date endFollow, Integer onlyFollow, Integer pageNo, Integer pageSize, String[] fields);

    /**
     * 不受关注时间限制，按照粉丝编码正序查询
     *
     * https://www.youzanyun.com/apilist/detail/group_scrm/user/youzan.users.weixin.followers.info.pull
     *
     * 与该接口相同：https://open.youzan.com/api/oauthentry/youzan.users.weixin.followers/3.0.0/pull 【即将废弃】
     *
     * @param afterFansId 用于拉取该粉丝编码之后的查询条件。
     *                    第一次查询可传入0，之后每次查询可传入上次查询里返回的last_fans_id，直到返回结果里的has_next为false
     * @param pageSize 每页条数，默认值：40，最大值：500
     * @param fields 需要返回的微信粉丝对象字段，如nick,avatar等。
     *               可选值：CrmWeixinFans微信粉丝结构体中所有字段均可返回；多个字段用“,”分隔。
     *               如果为空则返回所有
     * @return {
     *     users: // 搜索到的微信粉丝用户列表
     *     has_next: // 是否有下一页数据
     *     last_fans_id: // 当前列表中最后一个粉丝编码
     * }
     */
    YouzanUsersWeixinFollowersInfoPullResult followerPull(Integer afterFansId, Integer pageSize, String[] fields);

    // todo 芋艿，标签相关，可能要调整下

    /**
     * 获取单个粉丝标签集合
     *
     * https://www.youzanyun.com/apilist/detail/group_scrm/user/youzan.users.weixin.follower.tags.get
     *
     * @param weixinOpenid 微信粉丝用户的openid
     * @param fansId 微信粉丝用户ID。 调用时，参数 weixin_openid 和 fans_id 选其一即可
     * @return 该粉丝的标签集合
     */
    List<YouzanUsersWeixinFollowerTagsGetResult.CrmFansTag> tagGet(String weixinOpenid, Integer fansId);

    /**
     * 根据微信粉丝用户的 openid 或 user_id 绑定对应的标签
     *
     * https://www.youzanyun.com/apilist/detail/group_scrm/user/youzan.users.weixin.follower.tags.add
     *
     * @param weixinOpenid 微信粉丝用户的openid
     * @param fansId 微信粉丝用户ID。 调用时，参数 weixin_openid 和 fans_id 选其一即可
     * @param tags 标签名，多个标签名用“,”分隔
     * @param fields 需要返回的微信粉丝对象字段，如nick,avatar等。
     *               可选值：CrmWeixinFans微信粉丝结构体中所有字段均可返回；多个字段用“,”分隔。
     *               如果为空则返回所有
     * @return 微信粉丝用户信息
     * // todo 很奇怪！？为啥要返回
     */
    YouzanUsersWeixinFollowerTagsAddResult.CrmWeixinFans tagAdd(String weixinOpenid, Integer fansId, String[] tags, String[] fields);

    /**
     * 根据微信粉丝用户的 openid 或 user_id 删除对应的标签 一次删除的标签数量不能大于20
     *
     * https://www.youzanyun.com/apilist/detail/group_scrm/user/youzan.users.weixin.follower.tags.delete
     *
     * @param weixinOpenid 微信粉丝用户的openid
     * @param fansId 微信粉丝用户ID。 调用时，参数 weixin_openid 和 fans_id 选其一即可
     * @param tags 标签名，多个标签名用“,”分隔
     * @return 删除是否成功
     */
    Boolean tagDelete(String weixinOpenid, Integer fansId, String[] tags);
}
