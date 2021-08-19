package aamir;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class MyException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	MyException(String a) {
        super(a);
    }
}

public class CustomeException {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter Age");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int age = Integer.parseInt(br.readLine());
        try {
            if (age < 19) {
                throw new MyException("Age Should be greater than 18");
            } else {
                System.out.println("eligible for voting");
            }
        } catch (MyException e) {
            e.printStackTrace();
        }
    }
}
