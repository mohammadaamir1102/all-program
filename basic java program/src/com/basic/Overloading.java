package com.basic;

public class Overloading {
    static int run(int a,int b){
        return a+b;
    }
    static int run(int a, int b, int c){
        return a+b+c;
    }
    public static void main(String[] args) {
        System.out.println(Overloading.run(12,12));
        System.out.println(Overloading.run(12,12,12));
    }
}
