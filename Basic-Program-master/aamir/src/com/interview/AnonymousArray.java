package com.interview;

public class AnonymousArray {

	public static void main(String[] args) {
		AnonymousArray.show(new int[] {12,32,45,76});
		
	}
	static void show(int []a)
	{
		int total=0;
		for (int i : a) {
			total=total+i;
		}
		System.out.println(total);
	}

}
