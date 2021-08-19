package com.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class MyException extends Exception {
    MyException(String a) {
        super(a);

    }
}

public class CustomException {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the age");
        Integer age = Integer.parseInt(bufferedReader.readLine());
        try {
            if (age < 18) {
                throw new MyException("age should be greater than 18 !");
            } else {
                System.out.println("eligible for vote");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
