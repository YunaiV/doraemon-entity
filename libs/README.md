## 介绍
+ 有赞开放平台Java版本的SDK，v2.0.2

## 版本历史
+ 1.0.0-beta 第一个测试版
+ 1.0.1-beta 修复多个bug测试版
+ 2.0.0 全新版，更加完善的调用，不向前兼容老版本
+ 2.0.1 增加非模型化调用execute方法，兼容2.0.0版本
+ 2.0.2 增加获取token的操作，向下兼容2.0.x版本

## 设计思想
+ 所有的开放平台接口均实现了模型化（除非常久远的历史接口）
+ 所有的接口遵循API、Params和Result模式，即API、入参和出参，API上绑定params后交由client执行后返回result，例如：youzan.item.create 3.0.0这个API，API模型为YouzanItemCreate（放在了v3_0_0包下），入参为YouzanItemCreateParams，出参为YouzanItemCreateResult
+ 2.0.1版本后增加非模型化调用，但核心思想仍然是将用户参数转为模型调用

## 环境

```
jre(Java运行时环境) >= 6（强烈建议使用jre 7+）
三方库依赖: guava 19.0、apache http client 4.5.2等
```

## 常见问题
+ 引用jar后出现"No Such Method"或"No Class Def Found Error"异常串，说明jar包冲突了，请自行google解决

## 使用
### 1. 解压缩zip文件，获得一个jar包和sources.jar文件
+ jar包是核心逻辑实现的包
+ sources是源码文件，可以引用到项目中查看该jar对应的源码

### 2. 引用包
#### 2.1 方法1: 手动引用jar到项目（可以将sources.jar文件附带上，便于查看源码）
#### 2.2 方法2: 本地mvn install到local仓库，并在pom中引用该依赖
#### 2.3 方法3：将该jar发布到自己公司仓库，并在pom中依赖

## 如何使用？（参考demo.java）
### 调用kdt.item.add接口

```
YZClient client = new DefaultYZClient(new Token("$token"));

YouzanItemCreateParams youzanItemCreateParams = new YouzanItemCreateParams();
youzanItemCreateParams.setTitle("XXX");//商品名
youzanItemCreateParams.setPrice(258.0f);    //价格
youzanItemCreateParams.setPostFee(0.0f);          //运费
youzanItemCreateParams.setQuantity("58");
youzanItemCreateParams.setOuterId("119149");
youzanItemCreateParams.setSkuOuterIds("001,002,003,004,005,006");
youzanItemCreateParams.setSkuPrices("258.00,258.00,258.00,258.00,258.00,258.00");
youzanItemCreateParams.setSkuProperties("颜色:黑色;规格:L,颜色:黑色;规格:XL,颜色:黑色;规格:XXL,颜色:浅蓝色;规格:L,颜色:浅蓝色;规格:XL,颜色:浅蓝色;规格:XXL");
youzanItemCreateParams.setSkuQuantities("58,74,7,114,60,55");
youzanItemCreateParams.setHideQuantity(1L);
youzanItemCreateParams.setBuyQuota(20L);
youzanItemCreateParams.setCid(6000000L);
youzanItemCreateParams.setIsVirtual(0L);
youzanItemCreateParams.setOriginPrice("");

youzanItemCreateParams.setDesc("desc");

ByteWrapper[] byteWrappersAdd = new ByteWrapper[1];
ByteWrapper byteWrapper = new ByteWrapper("/Users/xx/Desktop/thumb_up_normal.png");
byteWrappersAdd[1] = byteWrapper;

youzanItemCreateParams.setImages(byteWrappersAdd);

YouzanItemCreate youzanItemCreate = new YouzanItemCreate(youzanItemCreateParams);
YouzanItemCreateResult result = client.invoke(youzanItemCreate);

assertTrue(result.getItem().getTitle().equals(youzanItemCreateParams.getTitle()));

```

### 调用kdt.shop.basic.get接口

```
YZClient client = new DefaultYZClient(new Sign("$app_id", "$app_secret"));
YouzanShopBasicGetParams youzanShopBasicGetParams = new YouzanShopBasicGetParams();
YouzanShopBasicGet youzanShopBasicGet = new YouzanShopBasicGet(youzanShopBasicGetParams);
YouzanShopBasicGetResult youzanShopBasicGetResult = client.invoke(youzanShopBasicGet);
assertEquals(youzanShopBasicGetResult.getName(), "我的店铺");
```

### 非模型化调用方式
```
Map<String, Object> params = Maps.newHashMap();
params.put("title", "测试添加商品201888");
params.put("price", 200);
params.put("post_fee", 11);

Multimap<String, ByteWrapper> fileParams = ArrayListMultimap.create();
fileParams.put("images[]",  new ByteWrapper("/Users/xx/Desktop/thumb_up_normal.png"));
// youzan.item.create已经改版，目前不支持直接传图片，详情参考有赞云API文档进行调用，这里只是演示怎么传参
String result = client.execute("youzan.item.create", "3.0.0", "POST", params, fileParams);
// String result = client.execute("youzan.items.onsale.get", "3.0.0", "GET", null, null);

System.out.println(result);
```

### 获取工具型token
```
// 先获取到code
AuthorizationCode authorizationCode = (AuthorizationCode) OAuthFactory.create(OAuthType.TOOL_TOKEN, new OAuthContext("clientId", "clientSecret", "redirectUrl", null, null));
authorizationCode.getCode();

// 再获取token
OAuth oauth = OAuthFactory.create(OAuthType.TOOL_TOKEN, new OAuthContext("clientId", "clientSecret", "redirectUrl", null, "code"));
System.out.println(JsonUtils.toJson(oauth.getToken()));
```

### 根据refresh token获取token
```
OAuth oauth = OAuthFactory.create(OAuthType.TOOL_REFRESH_TOKEN, new OAuthContext("clientId", "clientSecret", "refreshToken"));
System.out.println(JsonUtils.toJson(oauth.getToken()));
```

### 获取自用型token
```
OAuth oauth = OAuthFactory.create(OAuthType.SELF, new OAuthContext("clientId", "clientSecret", 111L));
System.out.println(JsonUtils.toJson(oauth.getToken()));
```

### 获取平台型token
```
OAuth oauth = OAuthFactory.create(OAuthType.PLATFORM, new OAuthContext("clientId", "clientSecret", 111L));
System.out.println(JsonUtils.toJson(oauth.getToken()));
```