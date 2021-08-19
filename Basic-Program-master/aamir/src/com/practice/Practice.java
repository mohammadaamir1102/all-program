package com.practice;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Practice {

	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			System.out.println("Enter the name");
			String name = s.nextLine();
			char[] ch = name.toCharArray();
			Set<Character> set = new HashSet<>();
			for (int i = 0; i < name.length(); i++) {
				if (set.contains(ch[i])) {
					continue;
				}
				int count = 1;
				for (int j = i + 1; j < name.length(); j++) {
					if (ch[i] == ch[j]) {
						count++;
					}

				}
				System.out.println(ch[i] + " is repeted " + count + " times");
				set.add(ch[i]);
			}

		}

	}
}
