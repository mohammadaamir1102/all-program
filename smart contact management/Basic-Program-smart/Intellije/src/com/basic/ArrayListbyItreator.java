package com.basic;

import java.util.*;

public class ArrayListbyItreator {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Collections.addAll(list, "aamir khna", "aasim khan");
        System.out.println(list.size());
        for (String s : list) {
            System.out.println(s);
        }

    }
}
