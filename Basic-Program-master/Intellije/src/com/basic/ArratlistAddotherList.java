package com.basic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArratlistAddotherList {
    public static void main(String[] args) {
        List<String>list=new ArrayList<>();
        list.add("aamir khan");
        list.add("aasim khan");
        list.add("aaquib khan");
        list.add("salman khan");
        List<String>list1=new ArrayList<>();
        list1.add("furqan khan");
        list1.add("zeeshan khan");
        list1.removeIf(a->a.contains("furqan khan"));
        list1.addAll(list);
        Collections.sort(list1);
        Collections.synchronizedList(list);
       // Collections.sort(list);
        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i));
        }

    }
    
}
