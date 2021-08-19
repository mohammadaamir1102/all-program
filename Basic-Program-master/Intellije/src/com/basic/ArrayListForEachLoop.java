package com.basic;

import java.util.ArrayList;
import java.util.List;

public class ArrayListForEachLoop {
    public static void main(String[] args) {
        List <String>list=new ArrayList<String>();
        list.add("aamir khan");
        list.add("aasim khan");
        list.add("aaquib");
        list.set(0,"arman");
        for (Object s:list) {
            System.out.println(s);
        }
    }
}
