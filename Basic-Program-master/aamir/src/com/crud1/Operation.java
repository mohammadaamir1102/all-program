package com.crud1;

import java.util.List;
import java.util.Scanner;
import java.util.concurrent.CopyOnWriteArrayList;

public class Operation {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		List<Student> a = new CopyOnWriteArrayList<Student>();
		System.out.println("How Many Student Do You Want To Add");
		int size = s.nextInt();
		for (int i = 0; i < size; i++) {

			System.out.println("Enter " + (i + 1) + " Student Name");
			String name = s.next();
			System.out.println("Enter " + (i + 1) + " Student Id");
			int id = s.nextInt();
			Student s1 = new Student();
			s1.setName(name);
			s1.setId(id);
			a.add(s1);
		}
		
		String text;
		do {
			System.out.println("Press 1 Find Student By Id");
			System.out.println("Press 2 For Update");
			System.out.println("Press 3 For all Student Show");
			System.out.println("Press 4 For Delete Student Details");
			System.out.println("Choose Anyone................");
			int choice = s.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter Id For Finding");
				int nextInt = s.nextInt();
				for (Student student : a) {
					if (student.getId() == nextInt) {
						System.out.println(student);
					}
				}
				break;
			case 2:
				System.out.println("Enter Id For Update");
				int nextint = s.nextInt();
				for (Student student : a) {
					if (student.getId() == nextint) {
						System.out.println("Add new Name");
						String next = s.next();
						student.setName(next);
					}
				}
				break;
			case 3:
				
				for (Student student : a) {
					System.out.println(student);
				}
				break;
			case 4:
				System.out.println("Enter Id For Delete");
				int nextint1 = s.nextInt();
				for (Student student : a) {
					if (student.getId() == nextint1) {
						a.remove(student);
						System.out.println("Delete Successfully");
						//System.out.println(student);
					}
				}
				break;
			default:
				System.out.println("Wrong Choice");
			}
			
			System.out.println("Do You Want To Continue ? y/n");
			text = s.next();

		} while (text.equalsIgnoreCase("y"));
		System.out.println("Thanks");
		

	}

}
