package main;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BubbleShort {
	public static void main(String[] args) {
		Integer[] a = { 6, 0, 5, 2, 0, 1, 0, 3, 0, 4 };
		List<Integer> asList2 = Arrays.asList(a);
		List<Integer> collect = asList2.stream().filter(b -> b > 0).sorted().collect(Collectors.toList());
		collect.forEach(q -> System.out.print(q + ","));
		List<Integer> collect2 = asList2.stream().filter(e -> e == 0).collect(Collectors.toList());
		collect2.forEach(w -> System.out.print(w + ","));
	}

}
