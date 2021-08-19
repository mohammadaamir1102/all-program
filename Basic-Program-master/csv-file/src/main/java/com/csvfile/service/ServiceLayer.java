package com.csvfile.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.csvfile.connection.DbConnection;
import com.csvfile.model.StudentModel;
import com.csvfile.transfer.Transfer;

public class ServiceLayer {
	public static void insert() {
		Connection connection = null;
		PreparedStatement p = null;
		try {
			connection = DbConnection.getConnection();
			for (int i = 0; i < 101; i++) {
				String q = "insert into studentData(studentName,studentAddress)values('Aamir khan" + i + "','Mumbai"+ i + "')";
				p = connection.prepareStatement(q);
					p.executeUpdate();

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void fetchData() {
		Connection connection = null;
		Statement stm = null;
		ResultSet rs = null;
		String q1 = "select * from studentData";
		try {
			connection = DbConnection.getConnection();
			stm = connection.createStatement();
			rs = stm.executeQuery(q1);
			StudentModel studentModel = new StudentModel();
			while (rs.next()) {
				studentModel.setStudentId(rs.getInt(1));
				studentModel.setStudentName(rs.getString(2));
				studentModel.setStudentAddress(rs.getString(3));
				Transfer.setIntoCsv(studentModel);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		ServiceLayer serviceLayer = new ServiceLayer();
		System.out.println("Inserted values");
		//serviceLayer.fetchData();
		serviceLayer.fetchData();
	}

}
