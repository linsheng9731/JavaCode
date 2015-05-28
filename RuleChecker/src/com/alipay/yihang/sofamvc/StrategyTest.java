package com.alipay.yihang.sofamvc;

/**
 * Created by damon_lin on 15/5/26.
 */

public class StrategyTest {
    public static void main(String args[]){
       System.out.println("main start---------------------------------");

        OfflineRiskDatumDO DO = new OfflineRiskDatumDO();
        Strategy s = new StrategyA();
        ErrorWrapper wrapper =  s.rulesCheck(DO);
        String[] results = wrapper.toString().split(";");
        for (String result : results) {
            System.out.println(result);
        }
//        System.out.println(wrapper.toString());

       System.out.println("main end-----------------------------------");
    }
}
