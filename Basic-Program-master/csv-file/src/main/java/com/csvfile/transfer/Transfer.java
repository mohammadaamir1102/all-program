package com.csvfile.transfer;

import java.io.File;
import java.io.FileWriter;

import com.csvfile.model.StudentModel;

public class Transfer {
	public static void setIntoCsv(StudentModel studentModel) {
		try {
			File file = new File("D:/StudentDetailshh.csv");
			FileWriter fileWriter = new FileWriter(file, true);
			String rs = "\r\n" + studentModel.getStudentId() + " " + studentModel.getStudentName() + " "
					+ studentModel.getStudentAddress();
			fileWriter.write(rs);
			fileWriter.flush();
			fileWriter.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
