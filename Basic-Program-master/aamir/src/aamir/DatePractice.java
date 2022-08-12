package aamir;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DatePractice {
	public static void main(String[] args) {
		Date date = new Date();
		String pattern = "MM-dd-yyyy";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		String dateAfterModification = simpleDateFormat.format(date);
		System.out.println(dateAfterModification);
		
		int a =0;
		int b=0;
		if(a>b) {
			System.out.println("hi");
		}else {
			System.out.println("bye");
		}
		
	}
}
