package jdbc;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.*;

public class InsertValueInDbms {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Hospital", "root", "root");
			String q = "insert into employee(Name,Age) values (?,?)";
			PreparedStatement p = con.prepareStatement(q);
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter the Name");
			String name = br.readLine();
			System.out.println("Enter the Age");
			String age = br.readLine();
			p.setString(1, name);
			p.setString(2, age);
			p.executeUpdate();
			con.close();
			System.out.println("values inserted");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
