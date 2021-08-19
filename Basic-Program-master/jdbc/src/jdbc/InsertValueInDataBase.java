  package jdbc;

import java.sql.*;

public class InsertValueInDataBase {

	public static void main(String[] args) {

		try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/flight", "root", "root")) {
			Class.forName("com.mysql.jdbc.Driver");
			String q = "insert into employee(Name,Age) values (?,?)";
			PreparedStatement p = con.prepareStatement(q);
			p.setString(1, "Aamir");
			p.setString(2, "21");
			p.executeUpdate();
			con.close();
			System.out.println("values update");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
