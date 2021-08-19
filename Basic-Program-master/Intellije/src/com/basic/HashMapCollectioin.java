package com.basic;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMapCollectioin {
	public static void main(String[] args) {
		Map<String, String>map=new TreeMap<>();
		map.put("a", "america");
		map.put("b", null);
		map.put("c", "a");
		map.put("d", "dehradun");
		map.put("e", null);
		map.put("f", "foriegn");
		for(Map.Entry<String,String> m:map.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
	}

}
