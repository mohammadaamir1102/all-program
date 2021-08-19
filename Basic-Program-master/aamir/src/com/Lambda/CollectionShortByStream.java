package com.Lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class CollectionShortByStream {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		Collections.addAll(list, 4,5,3,5,6,7,7,4,2,53);

		// this is for even number from list
		System.out.println("even number from list");
		List<Integer> z = list.stream().filter(a -> a % 2 == 0).collect(Collectors.toList());
		z.forEach(a -> System.out.println(a));

		System.out.println();
		System.out.println();
		// multiply every element by 2
		System.out.println("this number is find out after multiply");
		List<Integer> z1 = list.stream().map(a -> a * 2).collect(Collectors.toList());
		z1.forEach(System.out::println);

		System.out.println();
		System.out.println();
		// find out length of a particular elements
		System.out.println("Length of String------------------------");
		List<String> list2 = new ArrayList<>();
		list2.add("Aamir khan");
		list2.add("zeeshan khan khana");
		list2.add("deepak  kumar");
		list2.add("zainul abideen");
		list2.add("furqan khan khan");
		List<Integer> collect = list2.stream().map(a -> a.length()).collect(Collectors.toList());
		collect.forEach(System.out::println);

		System.out.println();
		System.out.println();
		// find out element which length greater than 10
		System.out.println("Length of whole list---------------------");
		List<String> collect2 = list2.stream().filter(a -> a.length() > 10).collect(Collectors.toList());
		collect2.forEach(System.out::println);

		System.out.println();
		System.out.println();

		// find out the count of name which length is greater than 10
		System.out.println("all element which length is greater than 10");
		long count = list2.stream().filter(s -> s.length() > 10).count();
		System.out.println("total elements is :" + count);
		
		System.out.println();       
		System.out.println();
		
		//sorting element
		System.out.println("sorting elements--------------");
		List<String> collect3 = list2.stream().sorted().collect(Collectors.toList());
		collect3.forEach(System.out::println);
		
		System.out.println();
		System.out.println();
		//sorting Integer
		
		List<Integer> collect4 = list.stream().sorted().collect(Collectors.toList());
		collect4.forEach(System.out::println);

	}

}
