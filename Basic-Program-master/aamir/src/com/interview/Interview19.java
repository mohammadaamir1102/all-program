package com.interview;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Interview19 {
	public static void main(String[] args) {
		List <String>list=new ArrayList<String>();
		list.add("aamir khan");
		list.add("arman");
		list.add("aaquib khan");
		list.add("salman");
		Iterator<String> itr=list.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
	}

}
