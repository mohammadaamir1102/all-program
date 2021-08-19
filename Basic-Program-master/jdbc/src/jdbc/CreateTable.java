package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateTable {
	public static void main(String[] args) {
		String q = "create table CreateTable(id int primary key auto_increment not null, name varchar(25) not null,age int(10))";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Mystudent", "root",
					"root");
			Statement createStatement = connection.createStatement();
			createStatement.executeUpdate(q);
			System.out.println("created");
			connection.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
