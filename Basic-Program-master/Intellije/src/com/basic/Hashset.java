package com.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Hashset {
	public static void main(String[] args) {
		Integer [] a= {2,4,5,6,7,7,9,9,3};
		List<Integer> set =new ArrayList<>(Arrays.asList(a));
		set.forEach(b -> System.out.println(b));
	}
}
//duplicate not allows
//one null allows
//does not follow insertion order
