package jdbc;

import java.sql.*;

public class FetchData {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/MyStudent", "root", "root");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from student");
			while (rs.next())
				System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t"+ rs.getString(3)
				+ "\t" + rs.getString(4) + "\t" + rs.getString(5));
			con.close();
		} catch (Exception e) {
			System.out.println(e);

		}

	}
}
