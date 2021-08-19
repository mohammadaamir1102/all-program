package com.basic;

import java.util.ArrayList;
import java.util.List;

public class ArrayListbyForloop {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("aatif");
        list.add("abid");
        list.add("ehtesham");
        list.add(0,"salman");
        for(int i=0;i<list.size();i++)
        {
            System.out.println(list.get(i));
        }
    }
}
