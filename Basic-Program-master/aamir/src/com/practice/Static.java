package com.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Static {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("zeeshan khan");
		list.add("furqan khan");
		list.add("aasim khan");
		list.add("aamir khan");
		Collections.sort(list);
		list.forEach(a->System.out.println(a));
		

	}

}
