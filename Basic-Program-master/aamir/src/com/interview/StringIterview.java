package com.interview;

public class StringIterview {

	public static void main(String[] args) {
		String s1="brook";
		String s2="book";
		int smallest=0;
		int counter=0;
		if(s1.length()<s2.length()) {
			smallest=s1.length();
		}
		else {
			smallest = s2.length();
		}
		if(s1.length()==s2.length()) {
			smallest=s2.length();
		}
		for (int i = 0; i < smallest; i++) {
			if(s1.charAt(i)!=s2.charAt(i)) 
			{
				counter++;
			}
		}
		System.out.println(counter);

	}

}
