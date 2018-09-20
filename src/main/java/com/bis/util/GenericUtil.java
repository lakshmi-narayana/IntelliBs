package com.bis.util;

import org.springframework.stereotype.Component;
import java.util.Map;
import java.util.HashMap;
@Component
public class GenericUtil
{
    public static <K,V> Map<K,V> mapCompare(Map<K,V> mapX, Map<K,V> mapY)
    {
        Map<K,V> resultMap  = new HashMap<K,V>();

        for(K key : mapX.keySet())
        {
            V valx = mapX.get(key);
            V valy = mapY.get(key);

            if(!valx.equals(valy))
            {
                resultMap.put(key, valy);
            }
        }

        return resultMap;
    }
    public static Map<String, String> mapCompareString(Map<String, String> s1, Map<String, String> s2)
    {
        Map<String,String> resultMapString = new HashMap<String,String>();
        for(String key : s1.keySet())
        {
            String val1 = s1.get(key);
            String val2 = s2.get(key);

            if(!val1.equals(val2))
            {
                resultMapString.put(key, val2);
            }
        }
        return resultMapString;
    }
    
}