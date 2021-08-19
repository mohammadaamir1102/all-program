package com.basic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ArrayListDescending {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        Collections.addAll(list,"aamir khan ","aasim khan","zeeshan khan","furqan khan");
        Collections.sort(list,Collections.reverseOrder());
        list.forEach(a->
            System.out.println(a));
    }
}