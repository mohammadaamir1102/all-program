package com.basic;

import java.util.Map;
import java.util.TreeMap;

public class MapDemo {

	public static void main(String[] args) {
		Map<Integer, String> map = new TreeMap<>();
		map.put(null, "Salman khan");
		map.put(2, "salman khan");
		map.put(1, "hello");
		for(Map.Entry<Integer, String> m: map.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}

}
