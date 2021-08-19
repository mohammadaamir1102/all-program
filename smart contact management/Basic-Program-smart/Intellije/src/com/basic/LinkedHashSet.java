package com.basic;

import java.util.Collections;
import java.util.Set;

public class LinkedHashSet<A> {
    public static void main(String[] args) {
        Set<String>set=new java.util.LinkedHashSet<>();
        Collections.addAll(set,"aamir","salman","furqan","shamshad");
        //Collections.reverse(s);
        set.forEach(a-> System.out.println(a));
    }
}
//only one null
// follows insertion order
//duplicate no allowed