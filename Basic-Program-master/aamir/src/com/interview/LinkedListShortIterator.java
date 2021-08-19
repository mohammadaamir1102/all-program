package com.interview;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;


public class LinkedListShortIterator {

	public static void main(String[] args) {
		List<String>list =new LinkedList<String>();
		list.add("aamir khan");
		list.add("salman khan");
		list.add("furqan khan");
		list.forEach(a->{
			System.out.println(a);
		});

	}

}