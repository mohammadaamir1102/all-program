package com.register;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String email = request.getParameter("email");
		String password = request.getParameter("pass");
		String conform_password = request.getParameter("cpass");
		if (email == null || email.trim().length() == 0 || email.isEmpty()) {
			request.getRequestDispatcher("Empty").forward(request, response);
			return;
		}
		if (password.equals(conform_password)) {
			try {

				Class.forName("com.mysql.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/registration", "root",
						"root");

				PreparedStatement ps = con.prepareStatement("insert into validate values(?,?,?)");

				ps.setString(1, email);
				ps.setString(2, password);
				ps.setString(3, conform_password);
				int i = ps.executeUpdate();

				if (i > 0) {
					out.println("<h1>You are sucessfully registered<h1>");
					request.getRequestDispatcher("index.html").include(request, response);

				}

			} catch (Exception se) {
				se.printStackTrace();
			}
		} else {
			request.getRequestDispatcher("Error").forward(request, response);
		}
	}

}
