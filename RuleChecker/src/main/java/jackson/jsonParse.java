package jackson;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

import java.io.File;
import java.io.FileReader;
import java.io.StringReader;
import java.lang.reflect.Field;
import java.text.ParseException;
import java.util.*;


public class JsonParse {


    private static Map StrategyMap = new HashMap();

    private static List<Map> StrategyList = new ArrayList();

    public static void main(String[] args) throws JSONException, ParseException {
        try {
            JSONObject jsonObject = new JSONObject(new JSONTokener(new FileReader(new File("/Users/damon_lin/Documents/GitHub/JavaCode/RuleChecker/src/main/java/jackson/tt.json"))));
//          JSONObject jsonObject = new JSONObject(new JSONTokener(new StringReader(jsonConfig)));
            JsontoMap("Strategy", StrategyMap, jsonObject);
            getStrategy("strategy1");
            System.out.println("strategy2 start-----");
            getStrategy("strategy2");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // init method
    public JsonParse(String config) {
        try {
            JSONArray jsonObject = new JSONArray(new JSONTokener(new StringReader((config))));
//          jsontoList("Strategy", StrategyMap, jsonObject); // init to map
            jsontoList("Strategy", StrategyList, jsonObject); // init to list
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Deprecated
    public static List getStrategy(String name) {
        List<Map> strategyList = (List) StrategyMap.get(name);
        return strategyList;
    }

    // get strategy from strategy map by strategy's name
    public static List getStrategy(String name, String domain) {
        StrategyMap = getStrategyMap(domain, StrategyList);
        List<Map> strategyList = (List) StrategyMap.get(name);
        return strategyList;
    }

    // find strategy map from strategy list by keywords
    public static Map getStrategyMap(String keywords, List<Map> list) {
        for (Map domainMap : list) {
            if (domainMap.get(keywords) != null) {
                return (Map) domainMap.get(keywords);
            }
        }
        return null;
    }


    // convert json object to map
    private static void JsontoMap(String lastKey, Map strategyMap, Object object) {
        // jsonObject
        Map map = new HashMap();
        JSONObject jsonObject = (JSONObject) object;
        Set<String> keys = jsonObject.keySet();
        for (String key : keys) {
            JSONObject tmp = jsonObject.optJSONObject(key);
            // jsonArray
            if (tmp == null) {
                JSONArray jsonArray = jsonObject.optJSONArray(key);
                // make sure
                if (jsonArray != null) {
                    List list = new ArrayList();
                    //  recurse
                    jsontoList(key, list, jsonArray);
                    strategyMap.put(key, list);
                    continue;
                } else {
                    // others
                    strategyMap.put(key, jsonObject.get(key).toString());
//                    System.out.println("jsonObject parse error--------");
                    continue;
                }
            }
            Set<String> childkeys = tmp.keySet();
            if (childkeys.size() > 0) {
                //  recurse
                JsontoMap(key, map, tmp);
                strategyMap.put(key, map);
                continue;
            } else {
                strategyMap.put(key, jsonObject.get(key).toString());
                continue;
            }
        }

        return;
    }

    // convert json object to list
    private static void jsontoList(String lastKey, List valList, JSONArray jsonArray) {
        // jsonArray
        for (int i = 0; i < jsonArray.length(); i++) {
            Map map = new HashMap();
            JSONObject jsonObject = jsonArray.optJSONObject(i);
            if (jsonObject == null) {
                JSONArray jsonArray1 = jsonArray.optJSONArray(i);
                // jsonArray
                if (jsonArray1 != null) {
                    // recurse
                    List newlist = new ArrayList();
                    jsontoList(lastKey, newlist, jsonArray1);
                    valList.add(newlist);
                    continue;
                }
                // others
                else {
//                    System.out.println("jsonArray parse error--------");
                    Class jclass = jsonArray.getClass();
                    try {
                        Field jsonArrayList = jclass.getDeclaredField("myArrayList");
                        jsonArrayList.setAccessible(true);
                        List tmplist = ((List) jsonArrayList.get(jsonArray));
                        for (Object item : tmplist) {
                            valList.add(item);
                        }

                    } catch (NoSuchFieldException e) {
                        e.printStackTrace();
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    }
                    return;
                }
            }
            // jsonObject
            else {
                Set<String> keys = jsonObject.keySet();
                if (keys.size() > 0) {
                    //  more than one jsonobject recurse
                    JsontoMap("" + i, map, jsonObject);
                } else {
                    //  add one jsonobject into map
                    for (String key : jsonObject.keySet())
                        map.put(key, jsonObject.get(key).toString());
                }
                valList.add(map);
            }
        }
    }
}