package com.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Scanner;

class OurException extends RuntimeException {
    OurException(String name) {
        super(name);
    }
}
public class CustomeException {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter the age");
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int age=Integer.parseInt(br.readLine());
        try {
            if (age < 33) {
                throw new OurException("Age must be 35 for making pilot");
            } else {
                System.out.println("Eligible for pilot");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        br.close();
    }
}
