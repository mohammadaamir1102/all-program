package aamir;

import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
		LinkedList<String> lis=new LinkedList<String>();
		lis.add("aamir khan");
		lis.add("aasim khan");
		lis.add("irfan khan");
		lis.add("arman khan");
		for (String string : lis) {
			System.out.println(string);
		}

	}
					
}
