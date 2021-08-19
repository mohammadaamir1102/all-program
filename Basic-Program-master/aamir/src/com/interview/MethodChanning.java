package com.interview;

public class MethodChanning {
	String name;
	int age;

	public MethodChanning set(String name) {
		this.name = name;
		return this;
	}

	public MethodChanning get(int age) {
		this.age = age;
		return this;
	}
	void show()
	{
		System.out.println(name+" "+age);
	}

	public static void main(String[] args) 
	{
		MethodChanning m=new MethodChanning();
		m.set("aamir").get(5).show();
	}

}
