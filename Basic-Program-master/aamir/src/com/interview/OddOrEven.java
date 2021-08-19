package com.interview;

public class OddOrEven {

	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,6};
		for (int i = 0; i < a.length; i++) {
			if(a[i]%2==0) {
				System.out.println("odd");
			}else {
				System.out.println("even");
				break;
			}
		}

	}

}
