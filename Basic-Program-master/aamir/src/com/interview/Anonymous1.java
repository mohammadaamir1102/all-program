package com.interview;

public interface Anonymous1 {
	void show();
	
	static void name()
	{
		System.out.println("name");
	}
	default void test() {
		System.out.println("test");
	}
	
}
