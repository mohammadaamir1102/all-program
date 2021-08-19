package com.corejava.revision;

public class Interface {
    
	public static void main(String[] args) {
		int[] a=new int[5];
		a[0]=10;
		a[1]=90;
		a[2]=11;
		a[3]=12;
		a[4]=14;
		for (int i : a) {
			System.out.println(i);
		}
		System.out.println("----------------------------------");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
}
