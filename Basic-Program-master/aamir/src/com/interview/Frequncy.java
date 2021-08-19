package com.interview;

import java.util.*;

public class Frequncy {

	public static void main(String[] args) {
		int[] arr = { 2, 2, 2, 54, 324, 234, 23, 2, 12, 12 };
		Set<Integer> nums = new HashSet<Integer>();

		for (int i = 0; i < arr.length; i++) {
			if (nums.contains(arr[i])) {
				continue;
			}
			int count = 1;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
				}

			}
			System.out.println("the number " + arr[i] + " is repeated " + count + " time");
			nums.add(arr[i]);

		}

	}
}
