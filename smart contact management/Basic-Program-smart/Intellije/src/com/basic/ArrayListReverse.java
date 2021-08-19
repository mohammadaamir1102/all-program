package com.basic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
public class ArrayListReverse {
    public static void main(String[] args) {
        List<String>list=new ArrayList<>();
        Collections.addAll(list,"aamir khan","zeeshan","xyan");
        //Collections.reverse(list);
        //Collections.sort(list);
        Collections.sort(list,Collections.reverseOrder());
        list.forEach(a->{
           System.out.println(a);
       });
    }
}
