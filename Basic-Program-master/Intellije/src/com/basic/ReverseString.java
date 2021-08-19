package com.basic;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String s=sc.next();
        String rev="";
        for(int i=s.length()-1;i>=0;i--)
        {
        rev=rev+s.charAt(i);
        }
        if(rev.equals(s)){
            System.out.println(s+" is palindrome String");
        }
        else {
            System.out.println(s+" is not palindrome string");
        }
    sc.close();
    }

}
