package com.interview;

import java.util.*;

public class MapPractice {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "aamir");
		map.put(2, "aasim");
		map.put(3, "salman");
		for (Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
		
	}

}
