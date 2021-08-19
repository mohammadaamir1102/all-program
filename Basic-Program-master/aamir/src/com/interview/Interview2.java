package com.interview;

import java.util.Scanner;

public class Interview2 {
	// write the java program from user and ask your name the out put
	// his name with hello <name> have a nice day

	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			System.out.println("enter yor name");
			String name = s.nextLine();
			System.out.println("hello " + name + " have a nice Day");
		}
	}

}
