package com.basic;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Arraylistshort {
    public static void main(String[] args) {
        List<String>list =new ArrayList<>();
        list.add("zesshan khan");
        list.add("furqan");
        list.add("shamsahd");
        list.add("salman");
        list.add("binyamin");
        Collections.sort(list);
        for(String s:list)
            System.out.println(s);
        List<Integer>list1=new ArrayList<>();
        list1.add(50);
        list1.add(34);
        list1.add(6);
        Collections.sort(list1);
        for(Integer i:list1)
        {
            System.out.println(i);
        }
    }
}
