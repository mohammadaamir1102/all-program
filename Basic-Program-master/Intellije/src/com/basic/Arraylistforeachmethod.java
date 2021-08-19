package com.basic;

import java.util.ArrayList;
import java.util.List;

public class Arraylistforeachmethod {
    public static void main(String[] args) {
        List<String>list=new ArrayList<>();
        list.add("aamir khan");
        list.add("aasim khan");
        list.add("salman khan");
        list.forEach(a->{
            System.out.println(a);
        });
    }
}
