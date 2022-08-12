package aamir;

import java.util.HashMap;
import java.util.Map;

public class RemoveElementFromMap {

	public static void main(String[] args) {

		Map<Integer, String> hashMap = new HashMap<>();
		hashMap.put(101, "a");
		hashMap.put(102, "b");
		boolean removeIf = hashMap.entrySet().removeIf(rmve -> (rmve.getKey() == 101));
		if (removeIf) {
//			hashMap.forEach((a, b)->System.out.println(a + " " + b));
			for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
				System.out.println(entry.getKey() + " " + entry.getValue());

			}
		}

	}

}
