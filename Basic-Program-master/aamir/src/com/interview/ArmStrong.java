package com.interview;

import java.util.Scanner;

public class ArmStrong {
	public static void main(String[] args) {
		int no, rem, sum = 0, arm;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number");
		no = s.nextInt();
		arm = no;
		while (no != 0) {
			rem = no % 10;
			sum = sum + (rem * rem * rem);
			no = no / 10;
		}
		if (sum == arm) {
			System.out.println(sum + " is an Armstrong");
		} else {
			System.out.println(sum + " is not an Armstrong");
		}
		s.close();
	}

}
