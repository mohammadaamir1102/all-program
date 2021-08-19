package com.interview;

public class ReverseString {

	public static void main(String[] args) {
		String s = "nadan";
		String rev = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);
		}
		if (s.equals(rev)) {
			System.out.println("palindrome string");
		} else {
			System.out.println("not palindrome");
		}

	}

}
