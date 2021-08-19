package com.basic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListPro {
    public static void main(String[] args) {
        List<Integer> li = new ArrayList<>();
        Collections.addAll(li, 2, 5, 7, 8, 3, 4, 67);
        //Collections.sort(li, Collections.reverseOrder());
        li.remove(1);
        li.forEach(System.out::println);
    }

}
