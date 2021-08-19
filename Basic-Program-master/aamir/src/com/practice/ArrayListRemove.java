package com.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ArrayListRemove {

	public static void main(String[] args) {
		Set<String>set=new HashSet<>();
	List<String>list=new ArrayList<String>();
	Collections.addAll(list, "Aamir khan","Salman khan","Aamir khan","Aamir khan");
	for (int i = 0; i < list.size(); i++) {
		if(set.contains(list.get(i))) {
			continue;
		}
		for (int j = i+1; j < list.size(); j++) {
			if(list.get(i)==list.get(j)) {
				list.remove(i);
				set.add(list.get(i));
				System.out.println(list);
			}
		}
	}

	}

}
