package jackson;

import java.util.Date;

/**
 * Created by damon_lin on 15/6/2.
 */
public class jsonParseTest {

    public static void main(String args[]) {
        System.out.println("=========================");

        ErrorWrapper wrapper = new ErrorWrapper("");
        OfflineRiskDatumDO DO = new OfflineRiskDatumDO();
        StrategyInterpret strategy = new StrategyInterpret(JsonConfig.jsongConfig);
        DO.setChannel("N");
        DO.setGmtModified(new Date());

        String domain = "TW";
        strategy.check(DO, wrapper, "strategy1",domain);
        strategy.check(DO, wrapper,"strategyL",domain);
        strategy.check(DO, wrapper,"strategyR0",domain);
        strategy.check(DO, wrapper,"strategyR1",domain);
        strategy.check(DO, wrapper,"strategy2",domain);
        strategy.check(DO, wrapper,"strategyR2",domain);
        strategy.check(DO, wrapper,"strategy3",domain);
        strategy.check(DO, wrapper,"strategyR3",domain);
        strategy.check(DO, wrapper,"strategyR_HWWH",domain);
        strategy.check(DO, wrapper,"strategyR",domain);
        strategy.check(DO, wrapper,"strategyTZ",domain);
        strategy.check(DO, wrapper,"strategyZC",domain);

        domain = "TW";
        strategy.check(DO, wrapper, "strategy1",domain);
        strategy.check(DO, wrapper,"strategyL",domain);
        strategy.check(DO, wrapper,"strategyR0",domain);
        strategy.check(DO, wrapper,"strategyR1",domain);
        strategy.check(DO, wrapper,"strategy2",domain);
        strategy.check(DO, wrapper,"strategyR2",domain);
        strategy.check(DO, wrapper,"strategy3",domain);
        strategy.check(DO, wrapper,"strategyR3",domain);
        strategy.check(DO, wrapper,"strategyR_HWWH",domain);
        strategy.check(DO, wrapper,"strategyR",domain);
        strategy.check(DO, wrapper,"strategyTZ",domain);
        strategy.check(DO, wrapper,"strategyZC",domain);
        
        String result= wrapper.toString();
        String[]results = result.split(";");
        System.out.println("================================");
        for (String res:results){
            System.out.println(res);
        }
        System.out.println("============================");
    }
}
