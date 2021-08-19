package jdbc;

import java.sql.*;

public class DataBaseConnectivity {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/flight", "root", "root");
			String q = "create table naukar(id int(10) primary key auto_increment,Name varchar(30),Age varchar(3))";
			Statement stmt = con.createStatement();
			stmt.executeUpdate(q);
			con.close();
			System.out.println("table created");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
