package aamir;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MapStreamPracticeOnUserClass {
	
	public static void main(String[] args) {
		
		List<User> userList = List.of(
				new User(1L, "Andrew", 23),
	            new User(2L, "Billy", 42),
	            new User(3L, "David", 29),
	            new User(4L, "Charlie", 30),
	            new User(5L, "Andrew", 18),
	            new User(6L, "Charlie", 19));
	
		
//		list convert to map
		Map<Long, String> convertedListIntoMap = userList.stream().collect(Collectors.toMap(User::getId, User::getName));
//		convertedListIntoMap.forEach((k,v) -> System.out.println(k +" "+v));
		
// 		only made id is key and all rest make as on object
		Map<Long, User> onlyMakeIdisaKey = userList.stream().collect(Collectors.toMap(User::getId, Function.identity()));
//		onlyMakeIdisaKey.forEach((k,v) -> System.out.println(k +" "+v));
		
		Map<String, Integer> idValueMap = userList.stream()
			    .collect(Collectors.toMap(User::getName, User::getAge, (oldValue, newValue) -> oldValue));
//		idValueMap.forEach((k,v) -> System.out.println(k +" "+v));

		Map<String, List<User>> groupByName = userList.stream()
	            .collect(Collectors.groupingBy(User::getName));
		groupByName.forEach((k,v) -> System.out.println(k +" "+v));

		
		
		
	}

}
