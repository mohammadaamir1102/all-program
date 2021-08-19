package aamir;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArraytoList {

	public static void main(String[] args) {
		String[] array = { "aamir", "aasim", "arman", "atif" };
	
		  List<String> list1 = new ArrayList<String>();
		  Collections.addAll(list1,array); 
		  list1.forEach(System.out::println);
		

	}

}
