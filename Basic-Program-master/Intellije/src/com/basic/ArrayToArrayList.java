package com.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToArrayList {
	public static void main(String[] args) {
		String[] array = { "aamir khan", "zeeshan khan", "salman khan" };
		List<String> list = new ArrayList<>(Arrays.asList(array));
		System.out.println(list.get(0));
		list.forEach(a -> System.out.println(a));
	}
}
