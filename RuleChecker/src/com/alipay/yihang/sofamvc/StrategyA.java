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
public class StrategyA implements Strategy {
    @Override
    public ErrorWrapper rulesCheck(OfflineRiskDatumDO DO) {

        Checker checker = new Checker(DO);
        DO.setGmtCreate(null);
        DO.setEventDate("test");
        DO.setRefNo("3");

        try {
            checker.checkNotNull("gmtCreate", "eventDate","bankIndexValue");

            checker.checkMustNull("refNo","partialRepresentment","settleAmount");

        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

        return checker.getWrapper();
    }


}
