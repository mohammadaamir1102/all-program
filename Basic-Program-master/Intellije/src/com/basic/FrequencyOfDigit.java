package com.basic;

import java.util.HashSet;
import java.util.Set;

public class FrequencyOfDigit {
    public static void main(String[] args) {
        int[] a={2,4,6,4,4,2,54,54,6};
        Set<Integer> set=new HashSet<>();
        for (int i = 0; i < a.length; i++) {
            if(set.contains(a[i])){
                continue;
            }
            int count=1;
            for (int j = i+1; j <a.length ; j++) {
                if(a[i]==a[j]){
                    count++;
                }
            }
            System.out.println("Number "+a[i]+" is repeated "+count+" times");
            set.add(a[i]);
        }
    }
}
