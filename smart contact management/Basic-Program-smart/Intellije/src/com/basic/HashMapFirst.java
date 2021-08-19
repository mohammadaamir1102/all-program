package com.basic;

import java.util.HashMap;
import java.util.Map;

public class HashMapFirst {
    public static void main(String[] args) {
        Map<Integer,String>map=new HashMap<>();
        map.put(1,"america");
        map.put(2,"india");
        map.put(3,"indonasia");
        map.put(4,"emirate");
        //getting the value by key
        System.out.println(map.get(1));
        //Contains check by key
        System.out.println(map.containsKey(1));
        //contains check by value
        System.out.println(map.containsValue("emirate"));
        //replace
        System.out.println(map.replace(1,"america","Dubai"));
        //remove value
        System.out.println(map.remove(1));
        map.put(1,"India");
        System.out.println(map.replace(2,"india","Mumbai"));
        //get key
        System.out.println(map.keySet());
        //get value
        System.out.println(map.values());
        //getting key and value together
        System.out.println(map.entrySet());
        for(Map.Entry z: map.entrySet())
       {
           System.out.println(z.getKey()+" "+z.getValue());
       }
    }
}
