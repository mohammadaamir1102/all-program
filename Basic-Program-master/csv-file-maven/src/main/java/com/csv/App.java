package com.csv;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {
		
		String csvFileLocation = "C:\\Users\\MOHAMMAD AAMIR KHAN\\Csvfile\\Student.csv";
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(csvFileLocation));
			CSVParser records = CSVParser.parse(br,
					CSVFormat.EXCEL.withFirstRecordAsHeader().withIgnoreHeaderCase().withTrim());

			SessionFactory factory = new Configuration().configure("com/csv/hibernate.cfg.xml").buildSessionFactory();

			Session session = factory.openSession();

			Transaction transaction = session.beginTransaction();
			for (CSVRecord record : records) {
				Student student = new Student();
				student.setStudentId(Integer.parseInt(record.get(0)));
				student.setStudentName(record.get(1));
				student.setStudentAddress(record.get(2));
				session.save(student);
			}

			transaction.commit();

		}catch (FileNotFoundException f) {
			f.printStackTrace();
		}catch (IOException i) {
			i.printStackTrace();
		}
	}
}
