package com.basic;

import java.util.ArrayList;
import java.util.List;

public class Arraylistmehtoduse {
    public static void main(String[] args) {
        List<String> list =new ArrayList<>();
        list.add("aamir khan");
        list.add("aasim khan");
        list.add("imityaz ahmad");
        list.set(2,"aaquib");//set a value
        list.add("imtiyaz ahmad");
        list.remove(0);
        System.out.println(list.get(0));//getting a value
        System.out.println(list.size());
        for (String s:list) {
            System.out.println(s);
        }

    }
}
