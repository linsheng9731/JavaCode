package com.alipay.yihang.sofamvc;

/**
 * Created by damon_lin on 15/5/26.
 */

public class StrategyTest {

    public static void main(String args[]){
       System.out.println("main start---------------------------------");

        OfflineRiskDatumDO DO = new OfflineRiskDatumDO();
        DO.setGmtCreate(null);
        DO.setEventDate("test");
        DO.setRefNo("3");
        DO.setChannel("N");

        Strategy s = StrategyFactory.getStrategy("1");
        ErrorWrapper wrapper =  s.rulesCheck(DO);
        dewrapper(wrapper);

        Strategy snull = StrategyFactory.getStrategy("null");
        wrapper = snull.rulesCheck(DO);
        dewrapper(wrapper);

       System.out.println("main end-----------------------------------");
    }

   static  void dewrapper(ErrorWrapper wrapper){
        String[] results = wrapper.toString().split(";");
        for (String result : results) {
            System.out.println(result);
        }
       System.out.println("");
    }
}
