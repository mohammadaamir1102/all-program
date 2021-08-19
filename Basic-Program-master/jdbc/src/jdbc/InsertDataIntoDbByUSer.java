package jdbc;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertDataIntoDbByUSer {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/AnkhonSeDil", "root",
					"root");
			String q = "insert into AnasKiAnkhonSeDil(Student_name,Student_age) values (?,?)";
			PreparedStatement p = connection.prepareStatement(q);
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			do {
				System.out.println("Enter student name");
				String name = br.readLine();

				System.out.println("Enter student age");
				int age = Integer.parseInt(br.readLine());

				p.setString(1, name);
				p.setInt(2, age);
				p.executeUpdate();

				System.out.println("Data saved successfully");
				System.out.println("Do you want to continue: y/n");
				String line = br.readLine();
				if (line.startsWith("n")) {
					break;
				}

			} while (true);
			System.out.println();
			System.out.println("Thank you for inserting data !!");
			connection.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
