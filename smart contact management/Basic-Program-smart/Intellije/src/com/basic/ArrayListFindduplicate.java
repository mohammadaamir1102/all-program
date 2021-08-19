package com.basic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListFindduplicate {
    public static void main(String[] args) {
        List<String>list=new ArrayList<>();
        Collections.addAll(list,"aamir","aasim","salman","irshad");
        List<String>list1=new ArrayList<>();
        Collections.addAll(list1,"aamir","aasim","furqan");
        list.retainAll(list1);
        System.out.println("Duplicate Elements is : "+list);
    }
}
