package com.interview;

public class UnwantedRemoveFromString {
	public static void main(String[] args) {
		   String s = "(123)-456-7891";
		    s = s.replaceAll("[^a-zA-Z0-9]","");
		    System.out.println(s);
	}

}
