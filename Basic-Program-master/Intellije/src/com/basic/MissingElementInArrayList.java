package com.basic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingElementInArrayList {
    public static void main(String[] args) {
        List<String>list=new ArrayList<>();
        Collections.addAll(list,"apple","mango","guvava","orange","copy");
        List<String>list1=new ArrayList<>();
        Collections.addAll(list1,"apple","mango","amrood","book");
        list.removeAll(list1);
        list1.removeAll(list);
        System.out.println(list);
        System.out.println(list1);

    }
}
