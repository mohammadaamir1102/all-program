package aamir;

import java.util.ArrayList;
import java.util.List;

public class NestedClass1 {
	
	public static void main(String[] args) {
		
		List<Object> list = new ArrayList<>();
		list.add("asad");
		list.add("arshad sir");
		list.add("sakib al hasan");
		list.add("ehtesham alam");
		list.add("aamir khan");
		
		/*
		 * Collection<Object> list2 =
		 * list.stream().filter(e->list.size()<6).collect(Collectors.toList());
		 * System.err.println(list2);
		 */
		list.forEach(a->System.out.println(a));
		
		
		
		
	}

}
