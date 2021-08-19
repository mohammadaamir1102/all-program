package com.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

class MyException extends Exception {
    MyException(String name) {
        super(name);
    }
}
//well done good job

public class CustomException {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter age");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int age = Integer.parseInt(br.readLine());
        try {
            if (age < 18) {
                throw new MyException("age must be 18");
            } else {
                System.out.println("eligible for voting");
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }

}
