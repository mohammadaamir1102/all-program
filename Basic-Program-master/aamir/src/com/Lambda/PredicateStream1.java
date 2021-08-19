package com.Lambda;

import java.util.Arrays;
import java.util.List;

class Predicate {
	private Integer id;
	private String name;
	private Integer salary;

	public Predicate(int id, String name, Integer salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Integer getsalary() {
		return salary;
	}

	@Override
	public String toString() {
		return "Predicate [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

}
/*
 * interface Pred{ boolean test(T t); }
 */

public class PredicateStream1 {
	public static void main(String[] args) {

		List<Predicate> list = Arrays.asList(new Predicate(1, "Aamir khan", 10000),
				new Predicate(3, "Aasim khan", 20000), new Predicate(2, "Aaquib khan", 30000),
				new Predicate(6, "Arman khan", 400000), new Predicate(5, "Aatif khan", 50000),
				new Predicate(4, "Arshad khan", 60000));
		// list.forEach(System.out::println);

		/*
		 * java.util.function.Predicate<Predicate>p= a -> a.getsalary()>50000; for
		 * (Predicate predicate : list) { if(p.test(predicate))
		 * System.out.println(predicate.getsalary()); }
		 */
		/*
		 * java.util.function.Predicate<Predicate> p1 = x -> x.getsalary() > 30000;
		 * System.out.println("id  Name  Salary"); for (Predicate predicate : list) { if
		 * (p1.test(predicate)) System.out.println(predicate.getId() + " " +
		 * predicate.getName() + " " + predicate.getsalary()); }
		 */
		java.util.function.Predicate<Predicate> p2 = x -> x.getName().contains("Aamir");
		for (Predicate predicate : list) {
			if (p2.test(predicate)) {
				System.out.println(predicate.getId() + " " + predicate.getName() + " " + predicate.getsalary());
			}

		}
	}

}
