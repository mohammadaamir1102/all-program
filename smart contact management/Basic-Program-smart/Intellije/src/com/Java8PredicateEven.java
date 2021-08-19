package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Java8PredicateEven {
    public static void main(String[] args) {
        List<Integer>list=new ArrayList<>();
        Collections.addAll(list,1,3,4,5,6,7,9);
       List<Integer> list1= list.stream().filter(a->a%2==0).collect(Collectors.toList());
       list1.forEach(System.out::println);
       List<Integer> list2=list.stream().map(a->a*2).collect(Collectors.toList());
       list2.forEach(System.out::println);
    }
}


