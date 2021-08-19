package com.practice;

public class Practice3 {
	static int a=1;
	public Practice3() {
		a++;
		System.out.println(a);
	}

	public static void main(String[] args) {
		Practice3 practice1=new Practice3();
		Practice3 practice2=new Practice3();
		Practice3 practice3=new Practice3();
	}
}
