package com.basic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListreverse2 {
    public static void main(String[] args) {
        List<String>list=new ArrayList<>();
        Collections.addAll(list,"zeeshan","arman","minhaz");
        for(int i=list.size()-1;i>=0;i--){
            System.out.println(list.get(i));
        }
    }
}
