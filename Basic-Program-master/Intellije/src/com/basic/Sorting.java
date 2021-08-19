package com.basic;

import java.util.ArrayList;
import java.util.Collections;

public class Sorting {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		Collections.addAll(list, "Aamir khan","Aasim khan","furqan khan");
		ArrayList<String> list2 = new ArrayList<>();
		Collections.addAll(list2, "Aamir khan","Aasim khan","furqan khan","hazra khatoon");
		list2.retainAll(list);
		System.out.println(list2);
		
	}
	

}
