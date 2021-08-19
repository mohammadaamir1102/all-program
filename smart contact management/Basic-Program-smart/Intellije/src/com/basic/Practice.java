package com.basic;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<String>();//Creating arraylis
//Traversing list through Iterator
        Iterator itr=list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
/*
* boolean
* character
* byte
* short      primitive data type
* int
* long
* float
* double
*
*
*
* 2|13|6
*   12
* -----
*    %
*
* */
