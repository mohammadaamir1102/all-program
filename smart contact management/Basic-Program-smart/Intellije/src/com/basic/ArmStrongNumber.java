package com.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArmStrongNumber {
    public static void main(String[] args) throws IOException {
        int rem, sum = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the Number for checking prime no");
        int no = Integer.parseInt(br.readLine());
        int arm = no;
        while (no != 0) {
            rem = no % 10;
            sum = sum + (rem * rem * rem);
            no = no / 10;
        }
        if (sum == arm)
            System.out.println("Arm Strong no");
        else
            System.out.println("Not Arm Strong");
    }
}
