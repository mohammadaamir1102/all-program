package com.interview;

import java.util.Scanner;

public class Interview8 {
	public static void main(String[] args) {
		int m1, m2, m3;
		try (Scanner s = new Scanner(System.in)) {
			System.out.println("Enter First Mark");
			m1 = s.nextInt();
			System.out.println("Enter Second Mark");
			m2 = s.nextInt();
			System.out.println("Enter Third Mark");
			m3 = s.nextInt();
		}
		float avg = (m1 + m2 + m3)/3.0f;
		if(avg>=40 &&m1>33 &&m2>33 &&m3>33) {
			System.out.println("congratulation u have passed out because ur avg is: "+avg);
		}
		else {
			System.out.println("u have faild so hard work because ur avg is: "+avg);
		}

	}
}
