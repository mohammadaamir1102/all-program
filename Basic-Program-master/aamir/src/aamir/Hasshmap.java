package aamir;

import java.util.Map;
import java.util.TreeMap;

public class Hasshmap {

	public static void main(String[] args) {
		Map<String, Integer> map = new TreeMap<>();
		map.put("salman khan", 1);
		map.put("aasim", 1);
		map.put("aasim", 5);
		map.put("ashraf", 1);
		map.put("furqan", 1);
		map.put("aamir", 109);
		for (Map.Entry<String, Integer> m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
		System.out.println("__________________________________________________");
		map.forEach((key,value)->{
			System.out.println(key+" "+value);
		});

	}

}
