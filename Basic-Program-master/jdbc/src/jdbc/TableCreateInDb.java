package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class TableCreateInDb {
	public static void main(String[] args) {
		String q = "create table TableCreation(id int primary key auto_increment ,name varchar(50) not null,age int(100) not null)";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/MyStudent", "root",
					"root");
			Statement statement = connection.createStatement();
			statement.executeUpdate(q);
			System.out.println("table has been created");
			connection.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
