package aamir;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapStudentExampleList {
	public static void main(String[] args) {
		List<MapStudentExample> user = List.of(new MapStudentExample(1L, "Aamir", 22),
				(new MapStudentExample(2L, "Aasim", 20)), (new MapStudentExample(3L, "Aaquib", 20)));
		Map<Long, String> collect = user.stream()
				.collect(Collectors.toMap(MapStudentExample::getId, MapStudentExample::getName));
		collect.forEach((a, b) -> System.out.println(a + " " + b));
	}
}
