package com.interview;


import java.util.LinkedList;
import java.util.List;

public class ListToarray {

	public static void main(String[] args) {
		List<String>list=new LinkedList<>();
		list.add("Aamir");
		list.add("salman");
		list.add("aasim ");
		list.remove(0);
		list.set(0, "arman");
		for (String string : list) {
			System.out.println(string);
		}

	}

}
