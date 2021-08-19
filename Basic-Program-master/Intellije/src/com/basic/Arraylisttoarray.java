package com.basic;

import java.util.ArrayList;
import java.util.List;

public class Arraylisttoarray {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        Object [] ob=list.toArray();
        for (Object object:ob) {
            System.out.println(object);
        }

    }
}
