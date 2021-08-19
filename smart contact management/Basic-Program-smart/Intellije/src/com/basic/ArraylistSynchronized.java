package com.basic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArraylistSynchronized {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("aamir khan");
        list.add("aasim khan");
        list.add("aaquib khan");
        Collections.synchronizedList(list);
        list.forEach(a->{
            System.out.println(a);
        });
    }
}
