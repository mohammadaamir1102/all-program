package com.interview;

import java.util.Scanner;

public class FibonacciByUser {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 0;
		int b = 1;
		int c;
		System.out.println("Put the number for fibonacci");
		int no = sc.nextInt();
		System.out.print(a+" ");
		System.out.print(b+" ");
		for (int i = 3; i <= no; i++) {
			c = a + b;
			System.out.print(c+" ");
			a=b;
			b=c;

		}
		sc.close();
	}

}
