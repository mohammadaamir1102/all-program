package com.interview;

public interface Computer {
int a=20;
void display();
}
class Aamir implements Computer{
	public void display()
	{
		//System.out.println(a);
	}
	public static void main(String[] args) {
		Aamir ab=new Aamir();
		System.out.println(a);
	}
	
}
