package com.basic;


@FunctionalInterface
public interface Lambda1 {
    void show();
    static void aamir(){
        System.out.println("aamir khan");
    }
    default void aasim(){
        System.out.println("aasim khan");
    }
}
