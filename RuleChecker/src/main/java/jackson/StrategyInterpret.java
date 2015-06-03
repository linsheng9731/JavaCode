package jackson;


import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by damon_lin on 15/6/2.
 */
public class StrategyInterpret {

    private JsonParse jsonParse;
    private Checker checker;

    public StrategyInterpret(String config) {
        this.jsonParse = new JsonParse(config);
    }


    public void check(OfflineRiskDatumDO DO, ErrorWrapper wrapper, String strategy, String domain) {
        this.checker = new Checker(DO, wrapper);
        List<Map> strategyList = jsonParse.getStrategy(strategy, domain);
        for (Map item : strategyList) {
            Set<String> keys = item.keySet();
            for (String key : keys) {
                List<String> params = (List<String>) item.get(key);
                // run the check rule
                System.out.print(key + ":");
                List<Class> paramTypes = new ArrayList<Class>();
                for (String param : params) {
                    System.out.print("," + param);
                    paramTypes.add(String.class);
                }
                String[] paramss = params.toArray(new String[0]);
                Class checkClass = checker.getClass();
                try {
                    Method method = checkClass.getDeclaredMethod(key, String[].class);
                    method.invoke(checker, new Object[]{paramss});
                } catch (NoSuchMethodException e) {
                    e.printStackTrace();
                } catch (InvocationTargetException e) {
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("");
        }

    }


}
