package com.basic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableInterface {
    public static void main(String[] args) {
        List<Customer> li = new ArrayList<>();
        Collections.addAll(li,
                new Customer(64, "zeeshan khan", 33, "mumbai"),
                new Customer(323, "aasim khan", 18, "basti"),
                new Customer(34, "aaquib khan", 14, "basti"));
        Collections.sort(li);
        li.stream().map(s->s.id+" "+s.name+" "+s.age+" "+s.city).forEach(System.out::println);
    }
}
