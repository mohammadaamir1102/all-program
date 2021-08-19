package com.services;

import java.io.File;
import java.io.FileWriter;

import com.pojo.EmployeePojo;

public class Services {
	static int count=1;
	public static void convertInCsv(EmployeePojo employeePojo) {
		try {
			File file=new File("D:/ExportInCsv");
			FileWriter Writer=new FileWriter(file,true);
			String data="\n\n" +employeePojo.getId()+", "+employeePojo.getName()+", "+employeePojo.getCity()
			+", "+employeePojo.getSalary()+","+employeePojo.getDesignation();
			Writer.write(data);
			Writer.flush();
			Writer.close();
			System.out.println("insertes-----------------------"+count);
			count++;
	
			
			
		} catch (Exception e) {
         e.printStackTrace();


         
		}
		
	}

}
