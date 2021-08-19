package com.basic;

public class ArrayPr {
    public static void main(String[] args) {
        String [] a=new String[5];
        a[0]="aamir khan";
        a[2]="salman khan";
        a[3]=null;
        System.out.println(a.length);
        for (String s : a) {
            System.out.println(s);
        }
    }
}
