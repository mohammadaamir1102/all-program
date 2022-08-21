package aamir;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DatePractice {
	public static void main(String[] args) throws ParseException {
		Date date = new Date();
		String pattern = "MM-dd-yyyy";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		String dateAfterModification = simpleDateFormat.format(date);
		System.out.println(dateAfterModification);

	}
}
