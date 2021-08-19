package com.interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListToStringArray {
	public static void main(String[] args) {
		List<String>list=new ArrayList<>();
		Collections.addAll(list, "Aamir khan","Salman khan","Aasim khan","Aaquib khan");
		String [] aStrings=new String[list.size()];
		list.toArray(aStrings);
		for (String string : aStrings) {
			System.out.println(string);
		}
	}

}
