package com.basic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArraylistByuserinput {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        Scanner s=new Scanner(System.in);
        System.out.println("how many student do you want to add");
        int n=s.nextInt();
        System.out.println("add elements");
        for (int i=0;i<=n;i++)
        {
            String a = s.nextLine();
            list.add(a);
        }
        System.out.println("elements is ");
        for (String b : list) {
            System.out.println(b);
        }

    }
}
