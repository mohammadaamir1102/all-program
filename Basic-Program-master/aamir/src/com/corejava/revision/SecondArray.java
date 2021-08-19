package com.corejava.revision;

public class SecondArray {
	public static void main(String[] args) {
		int[]a= {454,35,3,65,64,3435,2};
		int max=a[0];
		for (int i = 0; i < a.length; i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}System.out.println(max);
		
		
	}

}
