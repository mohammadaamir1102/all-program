package com.Lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class NameSortingByStream {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		Collections.addAll(list, "Aamir khan", "zainulabideen khan", "Zeeshan khan", "Sarfraz khan",
				"Imtiyaz ahmad khan");
		List<String> collect = list.stream().sorted().collect(Collectors.toList());
		collect.forEach(System.out::println);
		System.out.println();
		System.out.println("sorting name");
		System.out.println();
		System.out.println();

		List<String> list2 = new ArrayList<>();
		list2.add("Aamir khan");
		list2.add("zainulabideen khan");
		list2.add("Zeeshan khan");
		list2.add("Sarfraz khan");
		list2.add("Imtiyaz ahmad khan");
		List<String> collect2 = list2.stream().sorted().collect(Collectors.toList());
		for (String string : collect2) {
			System.out.println(string);
		}
	}

}
