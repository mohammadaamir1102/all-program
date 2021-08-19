package aamir;

import java.util.Scanner;

public class EvenOddLogic {

	public static void main(String[] args) {
		System.out.println("enter the no:");
		try (Scanner sc = new Scanner(System.in)) {
			int no = sc.nextInt();
			System.out.println("odd no:");
			for (int i = 1; i <= no; i++) {
				System.out.print(i + " ");
				i++;
				if (i == no) {
					i = 1;
					System.out.println("\neven no:");
					continue;
				}
			}
		}

	}

}
