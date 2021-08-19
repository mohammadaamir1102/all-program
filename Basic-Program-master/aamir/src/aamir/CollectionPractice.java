package aamir;

import java.util.Arrays;
import java.util.List;

public class CollectionPractice {
	public static void main(String[] args) {
		Integer[] a = { 12, 12, 12, 13 };
		List<Integer> list = Arrays.asList(a);
		for (Integer is : list) {
			System.out.println(is);
		}

	}

}
