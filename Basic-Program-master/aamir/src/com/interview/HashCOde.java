package com.interview;

import java.util.*;
import java.util.Map.Entry;


public class HashCOde {

	public static void main(String[] args) {
		/*
		 * String s="abc"; System.out.println(s.hashCode()); String s1="bac";
		 * System.out.println(s1.hashCode());
		 * 
		 * String x=new String("h"); String y=new String("h");
		 * System.out.println(x.hashCode()); System.out.println(y.hashCode());
		 */
	
	Map<String,Integer> m=  new HashMap();
	m.put("ABC", 1);
	m.put("BCA", 2);
	
	Set<Entry<String, Integer>> entrySet = m.entrySet();
	Iterator<Entry<String, Integer>> iterator = entrySet.iterator();
	while(iterator.hasNext())
	{
		Entry<String, Integer> next = iterator.next();
		System.out.println(next.hashCode());
	}
	
	
	}

}
