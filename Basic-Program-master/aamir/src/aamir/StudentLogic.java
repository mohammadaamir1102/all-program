package aamir;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class StudentLogic {

	public static void main(String[] args) {
		List<StudentPracticeSalaryIncrease> studentPractices = new ArrayList<>();
		studentPractices.add(new StudentPracticeSalaryIncrease(1, "Aamir khan", "Basti", 'M', 23, 10000d));
		studentPractices.add(new StudentPracticeSalaryIncrease(2, "Aasim khan", "Basti", 'M', 20, 9000d));
		studentPractices.add(new StudentPracticeSalaryIncrease(3, "Aaquib khan", "Basti", 'M', 15, 8000d));
		studentPractices.add(new StudentPracticeSalaryIncrease(4, "Arsalan khan", "Balaipur", 'M', 17, 7000d));
		studentPractices.add(new StudentPracticeSalaryIncrease(5, "Abid khan", "kurla", 'M', 19, 6000d));

		List<StudentPracticeSalaryIncrease> increaseSalaryList = studentPractices.stream().map(a -> {
			if (a.getAge() > 19) {
				a.setSalary(a.getSalary() + a.getSalary() * 0.1);
			}
			return a;
		}).collect(Collectors.toList());

		increaseSalaryList.forEach(System.out::print);

		System.out.println("_______________________");
		List<StudentPracticeSalaryIncrease> increaseSalary = increaseSalary(studentPractices);
		System.out.println(increaseSalary);
	}

	private static List<StudentPracticeSalaryIncrease> increaseSalary(List<StudentPracticeSalaryIncrease> studentPractices) {

		Iterator<StudentPracticeSalaryIncrease> iterator = studentPractices.iterator();
		List<StudentPracticeSalaryIncrease> increaseNew = new ArrayList<>();
		while (iterator.hasNext()) {
			StudentPracticeSalaryIncrease studentPractice = iterator.next();
			if (studentPractice.getAge() > 19) {
				studentPractice.setSalary(studentPractice.getSalary() + studentPractice.getSalary() * 0.1);
				increaseNew.add(studentPractice);
			}

		}
		return increaseNew;
	}

}
