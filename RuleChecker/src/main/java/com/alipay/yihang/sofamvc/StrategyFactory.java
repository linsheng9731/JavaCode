package com.alipay.yihang.sofamvc;

/**
 * Created by damon_lin on 15/5/30.
 */
public class StrategyFactory {

    public static Strategy getStrategy(String type){
//        switch (type){
//            case "1":return new Strategy1();
//            case "2":return new Strategy2();
//            case "3":return new Strategy3();
//            case "R":return new StrategyR();// special
//            case "R0":return new StrategyR0();
//            case "R1":return new StrategyR1();
//            case "R2":return new StrategyR2();
//            case "R3":return new StrategyR3();
//            case "L":return new StrategyL();
//            case "TZ":return new StrategyTZ();
//            case "ZC":return new StrategyZC();
//            default:return new StrategyNull();
//        }
        return new Strategy() {
            public ErrorWrapper rulesCheck(OfflineRiskDatumDO DO) {
                return null;
            }
        };
    }

}
