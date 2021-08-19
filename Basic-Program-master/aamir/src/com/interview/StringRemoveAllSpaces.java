package com.interview;

import java.util.Scanner;

public class StringRemoveAllSpaces {

	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		System.out.println("enter the String");
		String st=s.nextLine();
		String rem=st.replaceAll("\s+", "");
		System.out.println(rem);
	}

}
