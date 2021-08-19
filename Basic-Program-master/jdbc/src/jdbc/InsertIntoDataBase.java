package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

//insert data into database
public class InsertIntoDataBase {
	public static void main(String[] args) {
	try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/AnkhonSeDil",
				"root","root");
		String q="delete from AnasKiAnkhonSeDil where id=?";
		PreparedStatement p = connection.prepareStatement(q);
		p.setInt(1, 2);
		p.executeUpdate();
		connection.close();
		System.out.println("delete record base on id");
	} catch (Exception e) {
		System.out.println(e);
	}	
	}

}
