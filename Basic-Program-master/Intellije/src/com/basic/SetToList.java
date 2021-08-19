package com.basic;
import java.util.*;
public class SetToList {
    public static void main(String[] args) {
        Collection<String> set=new HashSet<>();
        set.add("aamir");
        set.add("aasim");
        set.add("salman");
        set.add("zeeshan");
        List<String>list=new ArrayList<>();
        list.addAll(set);
        list.forEach(a-> System.out.println(a));
    }
}
