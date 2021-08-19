package com.interview;

import java.util.ArrayList;
import java.util.List;

public class Interview21 {

	public static void main(String[] args) {
		int a[]=new int[] {1,2,3,4,5,6,7,8,9};
		List<Integer>list=new ArrayList<>();
		int total;
		for (int i = 0; i < a.length; i++) {
			if(a[i]%2==0) {
				total=a[i]*a[i];
				list.add(total);
			}
		}
		System.out.println(list);

	}

}
