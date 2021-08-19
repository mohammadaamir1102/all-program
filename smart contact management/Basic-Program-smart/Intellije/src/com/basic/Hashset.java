package com.basic;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Hashset {
    public static void main(String[] args) {
        Set<String>set=new HashSet<>();
        Collections.addAll(set,"aamir","aasim","zeeshan","furqan","kamre alam");
        set.forEach(a-> System.out.println(a));
    }
}
//duplicate not allows
//one null allows
//does not follow insertion order
