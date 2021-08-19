package com.basic;


import java.util.ArrayList;

interface Show {
    String show(String name);
}

public interface Practice2 {
    public static void main(String[] args) {
        Show s = (name)-> {
    return "Hello"+name;
        };
        System.out.println(s.show(" Aamir khan"));
    }
}
