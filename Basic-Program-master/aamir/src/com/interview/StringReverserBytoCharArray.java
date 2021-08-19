package com.interview;

public class StringReverserBytoCharArray {

	public static void main(String[] args) {
		String s1="aamir";
		char[] s=s1.toCharArray();
		for(int i=s.length-1;i>=0;i--) {
			System.out.print(s[i]);
		}

	}

}
