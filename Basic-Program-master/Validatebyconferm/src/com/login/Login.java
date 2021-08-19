package com.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.validate.Validate;

@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 response.setContentType("text/html");
	        PrintWriter out = response.getWriter();
	        
	        String email = request.getParameter("email");
	        String password = request.getParameter("pass");
	        
	        if(Validate.checkUser(email, password))
	        {
	            RequestDispatcher rs = request.getRequestDispatcher("Welcome");
	            rs.forward(request, response);
	        }
	        else
	        {
	           out.println("<h1>Username or Password incorrect<h1>");
	           RequestDispatcher rs = request.getRequestDispatcher("index.jsp");
	           rs.include(request, response);
	        }
	}

}
