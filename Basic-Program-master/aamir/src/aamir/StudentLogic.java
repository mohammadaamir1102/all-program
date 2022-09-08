package aamir;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StudentLogic {

	public static void main(String[] args) {
		Integer proposalPartyRoleMapId = 1;
		String questionId = "Basti";

		List<StudentPracticeSalaryIncrease> studentPractices = new ArrayList<>();
		studentPractices.add(new StudentPracticeSalaryIncrease(1, "Aamir khan", "Basti", 'M', 23, 10000d,
				Timestamp.valueOf(LocalDateTime.now())));
		studentPractices.add(new StudentPracticeSalaryIncrease(2, "Aasim khan", "Basti", 'M', 20, 9000d,
				Timestamp.valueOf(LocalDateTime.now())));
		studentPractices.add(new StudentPracticeSalaryIncrease(3, "Nida", "Basti", 'F', 15, 8000d,
				Timestamp.valueOf(LocalDateTime.now())));
		studentPractices.add(new StudentPracticeSalaryIncrease(4, "Fatima", "Balaipur", 'F', 17, 7000d,
				Timestamp.valueOf(LocalDateTime.now())));
		studentPractices.add(new StudentPracticeSalaryIncrease(5, "Abid khan", "kurla", 'M', 19, 6000d,
				Timestamp.valueOf(LocalDateTime.now())));
		studentPractices.add(new StudentPracticeSalaryIncrease(5, "Abid khan", "kurla", 'M', 19, 6000d,
				Timestamp.valueOf(LocalDateTime.now())));

		System.out.println("get zero "+studentPractices.get(0));
		for (StudentPracticeSalaryIncrease studentPracticeSalaryIncrease : studentPractices) {
			System.out.println("Time is " + studentPracticeSalaryIncrease.getTime());

		}
		List<StudentPracticeSalaryIncrease> increaseSalaryList = studentPractices.stream().map(a -> {
			if (a.getAge() > 19) {
				a.setSalary(a.getSalary() + a.getSalary() * 0.1);
			}
			return a;
		}).collect(Collectors.toList());

		increaseSalaryList.forEach(System.out::print);

		Stream<StudentPracticeSalaryIncrease> filter = studentPractices.stream()
				.filter(getGender -> getGender.getGender().toString().equalsIgnoreCase("M"));
		System.out.println("++++++++++++++" + filter);
		System.out.println("_______________________");
		List<StudentPracticeSalaryIncrease> increaseSalary = increaseSalary(studentPractices);
		System.out.println(increaseSalary);

		System.out.println("_______________________");
		Map<Character, Double> averagingBasedOnGender = studentPractices.stream()
				.collect(Collectors.groupingBy(StudentPracticeSalaryIncrease::getGender,
						Collectors.averagingInt(StudentPracticeSalaryIncrease::getAge)));
		averagingBasedOnGender.forEach((k, v) -> System.out.println(k + " " + v));

		Optional<Character> findAny = studentPractices.stream()
				.filter(item -> proposalPartyRoleMapId.equals(item.getId()))
				.filter(item -> questionId.equals(item.getAddress())).map(StudentPracticeSalaryIncrease::getGender)
				.findAny();
		System.out.println("find any..................... " + findAny.toString());

		// Date Practice
		Date date = new Date();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-mm-yyyy");
		String format = simpleDateFormat.format(date);
		System.out.println("fomate " + format);
	}

	private static List<StudentPracticeSalaryIncrease> increaseSalary(
			List<StudentPracticeSalaryIncrease> studentPractices) {

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
