package com.interview;

 class Bruce{
	private int a=10;
	private void aamir() {
		System.out.println("aamir khan");
	}
}

public class Accesmodifer1 {
	public static void main(String[] args) {
		Bruce b=new Bruce();
		//b.aamir();-------------------------compile time error
		//System.out.println(b.a);-------------------compile time error
	}
	

}
