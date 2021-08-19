package com.interview;

public class ArraySorting {

	public static void main(String[] args) {
		int temp=0;
		int[] a= {3,7,6,4,5,2,1};
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i]>a[j])
				{
				 temp = a[i];
				 a[i]=a[j];
				 a[j]=temp;
				}
			}
		}
		System.out.println(a[a.length-2]);
		
	}

}
