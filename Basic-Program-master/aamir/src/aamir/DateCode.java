package aamir;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateCode {

	public static void main(String[] args) throws ParseException {
		Date dt = new Date();
		SimpleDateFormat dateFormat;
		dateFormat = new SimpleDateFormat("dd-mm-yyyy");
		String format = dateFormat.format(dt);
		System.out.println(format);
		DateFormat sourceFormat = new SimpleDateFormat("dd-MM-yyyy");
		Date date = sourceFormat.parse(format);
		System.out.println(date);
	}
}