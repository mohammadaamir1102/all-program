package java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import aamir.Hello1;

public class CompratorJava8Example {
	public static void main(String[] args) {
		new CompratorJava8Example();
		List<StudentBook> studentBook = CompratorJava8Example.getStudentBook();
		studentBook.forEach(System.out::println);
	}

	public static List<StudentBook> getStudentBook() {
		List<StudentBook> bookData = new ArrayList<>();
		bookData.add(new StudentBook(1, "Java", 100));
		bookData.add(new StudentBook(2, "Hibernate", 100));
		bookData.add(new StudentBook(3, "Mysql", 100));
		bookData.add(new StudentBook(4, "JSP", 100));
		bookData.add(new StudentBook(5, "Servlet", 100));
		bookData.add(new StudentBook(6, "PHP", 100));
		Collections.sort(bookData, (o1, o2) -> o1.getBookName().compareTo(o2.getBookName()));
		return bookData;

	}
}
