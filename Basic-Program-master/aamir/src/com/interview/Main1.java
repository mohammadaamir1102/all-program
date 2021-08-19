package com.interview;

public class Main1 {

	public static void main(String[] args) {
		Anonymous1 a = () -> 
		System.out.println("aamir khan");//do't need curly braces because of one statement....
		a.show();
		a.test();
		Anonymous1.name();	
		
	}

}
