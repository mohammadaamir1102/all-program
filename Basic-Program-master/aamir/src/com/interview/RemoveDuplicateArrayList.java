package com.interview;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicateArrayList {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("aamir");
		list.add("aasim");
		list.add("aaquib");
		List<String> list1 = new ArrayList<String>();
		list1.add("aamir");
		list1.add("aasim");
		list1.add("aaquib");
		list1.add("salman");

		// DUPLICATE REMOVE
		/*
		 * list1.removeAll(list); System.out.println(list1);
		 */
		
		//RETAIN ALL FOR SEE DUPLICATE
		list1.retainAll(list);
		System.out.println(list1);
		/*
		 * list1.containsAll(list); System.out.println(list1);
		 */
	}

}
