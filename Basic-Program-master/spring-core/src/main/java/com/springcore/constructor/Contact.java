package com.springcore.constructor;

public class Contact {
	private String name;

	public Contact(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Conatact [name=" + name + "]";
	}
	

}
