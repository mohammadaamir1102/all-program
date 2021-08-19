package com.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
//comparable interface is used for order the object of user defined object
public class List_comprator {
    public static void main(String[] args) {
        List<Student> list=new ArrayList<>();
        list.add(new Student(3,90));
        list.add(new Student(2,91));
        list.add(new Student(4,85));
        list.add(new Student(1,75));
        list.add(new Student(5,80));
        Collections.sort(list);
        for (int i = 0; i <list.size() ; i++) {
            System.out.println(list.get(i));
        }
    }

}
