package com.Lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class NumberShortingByStream {
	public static void main(String[] args) {
		List<Integer>list=new ArrayList<>();
		Collections.addAll(list, 1,54,78,654,3576,98);
		List<Integer> collect = list.stream().sorted().collect(Collectors.toList());
		collect.forEach(System.out::println);
	}

}
