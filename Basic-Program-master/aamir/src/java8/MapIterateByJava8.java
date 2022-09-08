package java8;

import java.util.HashMap;
import java.util.Map;

public class MapIterateByJava8 {
	
	public static void main(String[] args) {
		Map<Integer,String> hashMap = new HashMap<>();
		hashMap.put(1, "India");
		hashMap.put(2, "America");
		hashMap.forEach((k,v)->System.out.println(k+" "+v));
		//second way to iterate
	}

}
