package aamir;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

class Aamir {
	public static void main(String[] args) {
		/*
		 * List<String> arrayList = new ArrayList<>(); Collections.addAll(arrayList,
		 * "Aamir","Aamir","Aasim");
		 * arrayList.stream().distinct().forEach(System.out::println);
		 * System.out.println("_________________________________");
		 * 
		 * 
		 * HashSet<String>set=new HashSet<>(); Collections.addAll(set,
		 * "hi","bye","hello","hi"); set.forEach(System.out::println);
		 */

		Map<String, String> map = new TreeMap<>();
		map.put("e", null);
		map.put("v", null);
		map.put("In", "india");
		map.put("UE", "united Emirat");
		for (Map.Entry<String, String> m : map.entrySet()) {
			System.out.println(m.getKey() + ":" + m.getValue());
		}

	}
}
