package com.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Hello {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Collections.addAll(list, "aamir", "aamir", "aasim", "aamir");
        List list1 = list.stream().filter(a -> a.endsWith("m")).collect(Collectors.toList());
        System.out.println(list1);
    }

}
