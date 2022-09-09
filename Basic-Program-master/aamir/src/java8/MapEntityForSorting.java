package java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class MapEntityForSorting {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("one", 1);
		map.put("four", 4);
		map.put("two", 2);
		map.put("five", 5);
		map.put("three", 3);

		List<Entry<String, Integer>> entries = new ArrayList<>(map.entrySet());
		Collections.sort(entries, new Comparator<Entry<String, Integer>>() {

			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
//				return o1.getKey().compareTo(o2.getKey());
				return o1.getValue().compareTo(o2.getValue());
			}
		});
		entries.forEach(a -> System.out.println(a));
		System.out.println("_______above example as a traditional approach way_________");

		List<Entry<String, Integer>> entries2 = new ArrayList<>(map.entrySet());
		Collections.sort(entries2, (o1, o2) -> o1.getValue().compareTo(o2.getValue()));
		entries2.forEach(a -> System.out.println(a));
		System.out.println("_______above example as a lambda approach way_________");

		map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
		System.out.println("_______above example as a stream approach way_________");
		
		map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
		System.out.println("_______above example as a stream approach way_________");
	}

}
