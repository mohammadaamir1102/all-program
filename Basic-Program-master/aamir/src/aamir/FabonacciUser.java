package aamir;

import java.util.Scanner;

public class FabonacciUser {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("enter the size for fbnci");
			int fab = scanner.nextInt();
			int a = 0, b = 1;
			System.out.println(a);
			System.out.println(b);
			for (int i = 3; i <= fab; i++) {
				int c = a + b;
				System.out.println(c);
				a = b;
				b = c;
			}
		}

	}

}
