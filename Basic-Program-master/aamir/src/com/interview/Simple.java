package com.interview;
abstract class Saq{
	Saq(int a)
	{
		System.out.println("abc");
	}
	abstract void m1();
	
}

public class Simple extends Saq {

	

	Simple(int a) {
		super(a);
		
	}
	@Override
	void m1() {
		System.out.println("xyz");
		
	}
	public static void main(String[] args) {
		Simple s=new Simple(0);
		s.m1();
	}

	
}
