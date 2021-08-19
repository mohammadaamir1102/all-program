package aamir;

import java.util.Scanner;

class MeException extends RuntimeException {
	MeException(String a) {
		super(a);
	}
}
public class TrycatchExcepitonbyMe {
		public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter The Number");
		int age = s.nextInt();
		try {
			if (age < 18) {
				throw new MeException("Age must be 18");
			} else {
				System.out.println("Eligible for voting");
			}
		} catch (MeException m) {
			m.printStackTrace();
		}
		s.close();
	}
}
