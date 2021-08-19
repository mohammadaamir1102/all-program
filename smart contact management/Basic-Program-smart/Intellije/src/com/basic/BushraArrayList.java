package com.basic;

import java.util.*;

public class BushraArrayList {
    public static void main(String[] args) {
       int [] a={5,4,3,6,7,9,6,4};
       Arrays.sort(a);
       int temp=0;
       for(int i=0;i<a.length-1;i++){
           if(a[i]!=a[i+1]){
               a[temp++]=a[i];
           }
       }
       a[temp++]=a[a.length-1];
       for(int i=0;i<temp;i++){
           System.out.println(a[i]);
       }


    }
}

