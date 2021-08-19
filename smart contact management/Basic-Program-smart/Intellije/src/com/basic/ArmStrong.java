package com.basic;

public class ArmStrong {
    public static void main(String[] args) {
        int no=2,rem,sum=0;
        int arm=no;
        while(no!=0)
        {
             rem = no % 10;
            sum=sum+(rem*rem*rem);
            no=no/10;
        }
        if(arm==sum)
            System.out.println(sum+" is arm");
        else
            System.out.println(sum+" is not arm");
    }


}
