package com.crud;

import java.util.*;
import java.util.Scanner;
import java.util.concurrent.CopyOnWriteArrayList;

public class Perform {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		List<Student> a = new CopyOnWriteArrayList<Student>();
		System.out.println("How Many Student Do You Want To Add");
		int size = s.nextInt();
		for (int i = 0; i < size; i++) {
			System.out.println("Enter " + (i + 1) + " Id");
			int id = s.nextInt();
			System.out.println("Enter " + (i + 1) + " Name");
			String name = s.next();
			Student sc = new Student();
			sc.setId(id);
			sc.setName(name);
			a.add(sc);
		}
		String text;
		do {
			System.out.println("Press 1 for Finding By Id");
			System.out.println("Press 2 for Update");
			System.out.println("Press 3 for Show All Data");
			System.out.println("Press 4 for Delete");
			int choice = s.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter Id For Finding");
				int next = s.nextInt();
				for (Student student : a) {
					if (student.getId() == next) {
						System.out.println(student);

					}
				}
				break;
			case 2:
				System.out.println("Enter id for Update");
				int nextint = s.nextInt();
				for (Student student : a) {
					if (student.getId() == nextint) {
						System.out.println("enter new name");
						String st = s.next();
						student.setName(st);
					}
				}
				break;
			case 3:
				for (Student student : a) {
					System.out.println(student);
				}
				break;
			case 4:
				System.out.println("Enter Id For delete");
				int next2 = s.nextInt();
				for (Student student : a) {
					if (student.getId() == next2) {
						a.remove(student);
						System.out.println("delete successfully");
					}
				}

				break;
			default:
				System.out.println("wrong field");
			}
			System.out.println("do u want to continue ?y/n");
			text = s.next();

		} while (text.equalsIgnoreCase("y"));
		System.out.println("Thanks");
		s.close();
	}

}
