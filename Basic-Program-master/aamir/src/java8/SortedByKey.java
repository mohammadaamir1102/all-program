package java8;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortedByKey {

	Map<String, Integer> unsortMap = getMap();

	private Map<String, Integer> getMap() {
		Map<String, Integer> unsortMap = new HashMap<>();
		unsortMap.put("z", 10);
		unsortMap.put("b", 5);
		unsortMap.put("a", 6);
		unsortMap.put("c", 20);
		unsortMap.put("d", 1);
		unsortMap.put("e", 7);
		unsortMap.put("y", 8);
		unsortMap.put("n", 99);
		unsortMap.put("g", 50);
		unsortMap.put("m", 2);
		unsortMap.put("f", 9);
		return unsortMap;
	}

	public static void main(String[] args) {
		SortedByKey sortedByKey = new SortedByKey();
		Map<String, Integer> map = sortedByKey.getMap();
		map.entrySet().stream().sorted(Map.Entry.comparingByKey()).collect(Collectors.toMap(Map.Entry::getKey,
				Map.Entry::getValue, (oldValue, newValue) -> oldValue, HashMap::new));
		map.forEach((k, v) -> System.out.println(k + " " + v));
	}
}
