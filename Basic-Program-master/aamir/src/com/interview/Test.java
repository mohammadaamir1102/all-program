package com.interview;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) throws NumberFormatException, IOException {

		List<Student> student = new ArrayList<>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the iteration number");
		int norow = Integer.parseInt(br.readLine());
		for (int i = 1; i <= norow; i++) {
			System.out.println("enter the emplyee id");
			Integer empid = Integer.parseInt(br.readLine());
			System.out.println("enter the name");
			String name = br.readLine();
			List<Integer> mark = new ArrayList<>();
			for (int j = 1; j <= 3; j++) {
				System.out.println("enter the mark");
				mark.add(Integer.parseInt(br.readLine()));
			}
			Student s = new Student();
			s.setEmpId(empid);
			s.setName(name);
			s.setMark(mark);
			student.add(s);

		}
		for (Student integer : student) {
			System.out.println(integer);
		}

	}

}
