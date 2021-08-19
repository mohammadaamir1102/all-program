package aamir;

import java.util.ArrayList;

import java.util.Collections;
import java.util.List;

public class ArrayListSorted {

	public static void main(String[] args) {
		System.out.println("String sorted");
		System.out.println();
		List<String> list = new ArrayList<String>();
		list.add("zeeshan");
		list.add("kamran");
		list.add("Aatif abid");
		list.add("Aamir");
		Collections.sort(list);
		for (String string : list)
			System.out.println(string);

		System.out.println();
		System.out.println("Integer sorted");
		System.out.println();
		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(1);
		list1.add(90);
		list1.add(44);
		list1.add(1);
		Collections.sort(list1);
		for (Integer string2 : list1)
			System.out.println(string2);

	}

}
