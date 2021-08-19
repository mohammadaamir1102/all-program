package com.basic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListbyForloop {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("zeeshan");
        list.add("abid");
        list.add("ehtesham");
        Collections.sort(list);
        for(int i=0;i<list.size();i++)
        {
            System.out.println(list.get(i));
        }
    }
}
