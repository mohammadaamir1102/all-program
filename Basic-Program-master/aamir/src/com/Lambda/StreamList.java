package com.Lambda;

import java.util.ArrayList;
import java.util.List;

public class StreamList {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(3);
		list.add(4);
		list.add(6);
		list.add(9);
		System.out.println(list);
		ArrayList<Integer> arrayList = new ArrayList<>();
		for (Integer integer : list) {
			if (integer % 2 == 0) {
				arrayList.add(integer);
			}
		}
		System.out.println(arrayList);

	}
}
