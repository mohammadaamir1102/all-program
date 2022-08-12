package com.Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student123 {
	private int age;
	private String name;
	private String Adress;

	public Student123(int age, String name, String adress) {
		super();
		this.age = age;
		this.name = name;
		Adress = adress;
	}

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	public String getAdress() {
		return Adress;
	}

	@Override
	public String toString() {
		return "Aamir [age=" + age + ", name=" + name + ", Adress=" + Adress + "]";
	}

}

public class CollectionShortByLambda {
	public static void main(String[] args) {
		List<Student123> list = new ArrayList<>();
		list.addAll(Arrays.asList
				(new Student123(1, "aamir", "sakinaka"),
				(new Student123(12, "salman", "Millat")),
				(new Student123(9, "zeeshan", "Basti")),
				(new Student123(4, "mudassir", "Mumbai"))));

		list.forEach(a -> System.out.println(a));
		System.out.println("-------------------------------------------------");

		// first way
		Comparator<Student123> com = new Comparator<Student123>() {

			@Override
			public int compare(Student123 s1, Student123 s2) {
				return s1.getName().compareTo(s2.getName());
			}
		};
		Collections.sort(list, com);
		list.forEach(System.out::println);

		/*
		 * // second way Collections.sort(list,
		 * Comparator.comparing(Student123::getAge)); list.forEach(a ->
		 * System.out.println(a));
		 */
		Collections.sort(list,Comparator.comparing(Student123::getAge));
		list.forEach(studentIterate -> System.out.println("List Iteration "+studentIterate));
		
	}

}
