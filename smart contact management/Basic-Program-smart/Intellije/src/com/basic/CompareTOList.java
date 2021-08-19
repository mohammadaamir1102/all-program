package com.basic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CompareTOList {
    public static void main(String[] args) {
        List<String>list=new ArrayList<>();
        Collections.addAll(list,"aamir khan","aasim khan");
        List<String>list1=new ArrayList<>();
        Collections.addAll(list1,"aamir khan","aasim khan");
        boolean b=list.equals(list1);
        System.out.println(b);
    }
}
