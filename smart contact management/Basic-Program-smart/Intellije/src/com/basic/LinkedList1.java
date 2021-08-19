package com.basic;

import java.util.ArrayList;
import java.util.*;
import java.util.List;

public class LinkedList1 {
    public static void main(String[] args) {
        List<String>list=new LinkedList<>();
        Collections.addAll(list,"aamir han","aasim khan","arman khan");
        System.out.println(list.get(1));
        list.forEach(System.out::println);
    }
}
