package cn.iocoder.doraemon.tradegroup;

import com.youzan.open.sdk.gen.v3_0_0.model.YouzanTradeGetResult;

public interface TradeAPI {

    YouzanTradeGetResult get(String tid, Boolean withChilds,
                             Integer subTradePageNo, Integer subTradePageSize, String[] fields);

}
