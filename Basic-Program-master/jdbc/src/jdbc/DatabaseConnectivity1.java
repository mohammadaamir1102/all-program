package jdbc;

import java.sql.*;

public class DatabaseConnectivity1 {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/MyStudent", "root",
					"root");
			Statement statement = connection.createStatement();
			ResultSet rs = statement.executeQuery("select * from student");
			System.out.println("id \t name \t phone \t city \t salary");
			while (rs.next()) {
				System.out.println(rs.getInt(1) + "\t " + rs.getString(2) + "\t" + rs.getString(3) + "\t"
						+ rs.getString(4) + "\t" + rs.getInt(5));
			}
			connection.close();
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
