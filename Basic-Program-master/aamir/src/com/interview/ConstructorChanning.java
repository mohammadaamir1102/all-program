package com.interview;

public class ConstructorChanning {
	 ConstructorChanning() {
		 this(5);
		System.out.println("Default Constructor");
	}
	ConstructorChanning(int z)
	{
		System.out.println(z*z*z);
	}

	public static void main(String[] args) 
	{
		ConstructorChanning c=new ConstructorChanning();
		

	}

}
