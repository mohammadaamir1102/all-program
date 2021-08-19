package com.interview;

import java.util.Scanner;

public class Interview14 {

	public static void main(String[] args) {
		System.out.println("enter the number");
		try (Scanner s = new Scanner(System.in)) {
			System.out.println(s.hasNextInt());
		}

	}

}
