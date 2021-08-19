package com.interview;
class Topi{
	void m() {
		System.out.println("aamir ");
	}
}

public class Interview13 extends Topi {
	void n() {
		System.out.println("aasim");
	}
	public static void main(String[] args) 
	{
		Topi t=new Interview13();
		t.m();

	}

}
