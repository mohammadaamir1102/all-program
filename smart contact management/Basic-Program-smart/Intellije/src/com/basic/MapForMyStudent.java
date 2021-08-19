package com.basic;

import java.util.HashMap;
import java.util.Map;

public class MapForMyStudent {
    public static void main(String[] args) {
        HashMap<String, String> has = new HashMap<>();
        has.put("am", "aamir khan");
        has.put("bs", "bushra");
        has.put("sum", "sumaiyya");
        has.put("an", "anas");
        has.put("eh", "ehtesham");
        has.put("jv", "javed");
        has.put("sal", "salman");
        has.put("uz", "uzair");
        has.put(null, "earphone");
        has.putIfAbsent("ch", "aamir khan");
        has.replace("ch", "aamir khan", "aasim");//replace value
        has.remove("ch");//removing elements
        System.out.println(has.keySet());//return keys
        System.out.println(has.values());//return values
        System.out.println(has.entrySet());//return key and also values
        for (Map.Entry m : has.entrySet()) {
            System.out.println(m.getKey() + " " + m.getValue());
        }
        System.out.println(has.get("sum"));//getting value
        System.out.println(has.containsKey("sum"));//contains checking base on key
        System.out.println(has.containsValue("aamir khan"));//contains base on value

    }
}
