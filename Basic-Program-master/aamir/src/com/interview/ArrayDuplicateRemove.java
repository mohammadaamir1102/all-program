package com.interview;

public class ArrayDuplicateRemove {

	public static void main(String[] args) {
		int[] a = { 1, 4, 7, 1, 7, 4, 9, 5 };
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] ==a[j]) {
					System.out.println(a[j]);
				}
			}
		}
	}

}
