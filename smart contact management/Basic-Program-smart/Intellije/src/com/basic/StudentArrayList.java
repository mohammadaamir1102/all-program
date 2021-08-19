package com.basic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentArrayList {
    public static void main(String[] args) {
        List<StudentForList> list = new ArrayList<StudentForList>();
        list.add(new StudentForList(121, "aamir khan", 33));
        list.add(new StudentForList(131, "aasim khan", 19));
        list.add(new StudentForList(141, "aaquib khan", 12));
        list.add(new StudentForList(151, "arman khan", 35));

        list.forEach(a -> System.out.println(a));

    }


}
