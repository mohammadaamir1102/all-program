package com.basic;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LinkedListSearching {
    public static void main(String[] args) {
        List<String>list=new LinkedList<>();
        Collections.addAll(list,"salman khan","furqan khan");
        System.out.println(list.get(1));
        System.out.println(list.remove(1));
    }
}
