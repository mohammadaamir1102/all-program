package com.interview;

public class StringShort {

	public static void main(String[] args) {
		String[] a= {"zeeshan","aamir","salman","qurban"};
		for (int i = 0; i < a.length; i++) {
			String temp;
			for (int j =i+1; j < a.length; j++) {
				if(a[i].compareTo(a[j])>0) 
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for (String string : a) {
			System.out.println(string);
		}
	}

}
