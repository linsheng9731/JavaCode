package com.alipay.yihang.sofamvc;

/**
 * Created by damon_lin on 15/5/26.
 */

/*
    gmtCreate;gmtModified; eventDate; eventType;bankIndexValue;platform;channel;
    bankIndexValueType; refNo;tradeNo;batchNo;bankBillNo;reasonCode; eventAmount;eventCurrency;
    replyDate;representment; partialRepresentment; settleAmount;settleCurrency; alipayDueAmount;
    merchantDueAmount;alipayPaidAmount; merchantPaidAmount;fee;operator;deleteCheck;uniqKey;
 */
public class StrategyNull implements Strategy {

    public ErrorWrapper rulesCheck(OfflineRiskDatumDO DO) {

        Checker checker = new Checker(DO);
        ErrorWrapper wrapper =  checker.getWrapper();
        wrapper.add("type code error");
        return wrapper;
    }


}
