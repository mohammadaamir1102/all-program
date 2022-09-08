package java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ListSortedByStream {

	public static void main(String[] args) {
		List<Integer> age = new ArrayList<>();
		age.add(10);
		age.add(5);
		age.add(11);
		age.add(13);
		age.add(20);
		
		List<Integer> ascending = age.stream().sorted().collect(Collectors.toList()); //Ascending
		ascending.forEach(System.out::println);
		
		System.out.println("__________________________");
		
		List<Integer> descending = age.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()); //Descending
		descending.forEach(System.out::println);
	}

}
