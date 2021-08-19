package com.basic;

public class StringInterviewByBilal {
    public static void main(String[] args) {
        String s="brook";
        String s1="book";
        int smallest=0;
        int temp=0;
        if(s.length() > s1.length() ){
             smallest = s1.length();
        }
        if(s.length() == s1.length())
           smallest = s1.length();
        for(int i=0;i < smallest;i++)
        {
                if(s.charAt(i)!=s1.charAt(i))
                {
                    temp=temp+1;
                }
            }
            System.out.println(temp);
        }


    }

