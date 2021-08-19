package aamir;

import java.util.Scanner;

public class EvenOddBySwitch {

	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			System.out.println("Enter the Number");
			int number = s.nextInt();
			switch (number % 2) {
			case 0:
				System.out.println(number + " is EVEN ");
				break;
			case 1:
				System.out.println(number + " is ODD");
			default:
				break;
			}
		}
	}

}
