package com.interview;

import java.util.ArrayList;
import java.util.List;

public class RemoveDublicateList {

	public static void main(String[] args) {
		List<String> al = new ArrayList<String>();
		al.add("Imran");
		al.add("Imran");
		al.add("Javed");
		al.add("Javed");
		al.add("kkc");
		al.add("Imran");
		for (int i = 0; i < al.size(); i++) {
			for (int j = i + 1; j < al.size(); j++) {
				if (al.get(i).equals(al.get(j))) {
					al.remove(j);
				}
			}
		}
		System.out.println("removed dublicate list" + al);

	}

}
