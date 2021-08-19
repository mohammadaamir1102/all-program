package com.basic;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDescending {
    public static void main(String[] args) {
        List<String>list=new LinkedList<>();
        Collections.addAll(list,"aamir khan","Zeeshan khan","salman khan","furqan khan ");
        Collections.sort(list);
        list.forEach(a->{
            System.out.println(a);
        });

    }
}

