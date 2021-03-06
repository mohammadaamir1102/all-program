package aamir;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class DuplicateInList {
	public static void main(String[] args) {
		List<String> list=new ArrayList<>();
		Collections.addAll(list, "Aamir","Aamir","Aamir","Aasim","Aasim","Aaquib");
		//find out duplicate elements only
		List<String> list2 = list.stream().filter(i->Collections.frequency(list, i)>1).collect(Collectors.toList());
		list2.forEach(System.out::println);
		
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("__________________________________");
		
		//find out the quantity of Duplicate elements
		long list3 = list.stream().filter(i->Collections.frequency(list, i)>1).count();
		System.out.println(list3);
	}

}
