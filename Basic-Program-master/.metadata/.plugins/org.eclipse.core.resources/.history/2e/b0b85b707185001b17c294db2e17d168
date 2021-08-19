package com.Lambda;

import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student>{
	private int id;
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Jio [id=" + id + ", name=" + name + "]";
	}

	@Override
	public int compareTo(Student o) {
		/*
		 * if (this.id>o.id) { return -1; }else if(this.id<o.id) { return 1; } return 0;
		 */
		return Integer.compare(o.id, this.id);// this is for descending
		// return Integer.compare(this.id,o.id);//this is for ascending
	}



}

public class LambdaExpressionCollectionComprable {

	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<Student>();

		list.add(new Student(103, "aamir khan"));
		list.add(new Student(101, "aasim khan"));
		list.add(new Student(104, "aaquib khan"));
		list.add(new Student(102, "arman khan"));

		Collections.sort(list);
		list.forEach(System.out::println);

	}

}
