package com.Lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;


public class NameLenthByStream {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		Collections.addAll(list, "zebra", "Copy", "laptop", "laptop hp", "mobile charger");
		List<Integer> collect = list.stream().map(a->a.length()).collect(Collectors.toList());
		collect.forEach(System.out::println);
	}

}
