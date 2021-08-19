package com.basic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListModifiable {
	public static void main(String[] args) {
		List<String> list2 = new ArrayList<>();
		list2.add("Aamir khan");
		list2.add("Salman khan");
		list2.add("furqan khan");
		list2.add("Furqan khan");
		
		Iterator<String> iterator = list2.iterator();
		iterator.remove();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
			
		}
	}

}
