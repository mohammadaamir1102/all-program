package aamir;

import java.util.*;

public class ArrayListDescending {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("aamir khan");
		list.add("zeeshan");
		list.add("furqan");
		list.add("faisal");
		list.add("gufran");
		list.add("israil");
		System.out.println("before sorting"+list);
		Collections.sort(list);
		System.out.println("after ascending  "+list);
		Collections.sort(list,Collections.reverseOrder());
		System.out.println("after descending  "+list);
		
		
		}
		

	}


