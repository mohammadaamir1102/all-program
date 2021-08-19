package com.interview;

public class StringCount {

	public static void main(String[] args) {
		String a = "aamir khan";
		int count = 0;
		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i) == 'a') {
				count++;
			}
		}
		System.out.println(count);

	}

}
