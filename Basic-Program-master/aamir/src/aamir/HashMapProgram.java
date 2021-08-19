package aamir;

import java.util.TreeMap;

public class HashMapProgram {

    public static void main(String[] args) {
        TreeMap<String, String> map = new TreeMap<>();
        map.put("IN", "india");
        map.put("null",null);
        map.put("uk", "united Kingdom");
       map.forEach((a,b)->{
           System.out.println(a+" "+b);
       });
    }

}
