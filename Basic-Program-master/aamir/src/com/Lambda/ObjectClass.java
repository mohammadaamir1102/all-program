package com.Lambda;

import java.util.HashSet;
import java.util.Set;

class Book12 {
	int id;
	String name;

	public Book12(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Book12{" + "id=" + id + ", name='" + name + '\'' + '}';
	}

	@Override
	public boolean equals(Object ob) {

		return this.id == ((Book12) ob).id;
	}

	@Override
	public int hashCode() {
		return this.id;
	}

}

public class ObjectClass {
	public static void main(String[] args) {
		Set<Book12> l = new HashSet<>();
		l.add(new Book12(1, "A"));
		l.add(new Book12(1, "A"));
		System.out.println(l);
		
		
	}
}
