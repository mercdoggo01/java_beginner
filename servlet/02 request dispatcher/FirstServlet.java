package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String email = req.getParameter("user_email");
		String password = req.getParameter("user_password");
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		
		// Getting request dispatcher object
		
		RequestDispatcher rd;
		
		// condition for login
		if("demo@gmail.com".equals(email) && "demo123".equals(password))
		{
			// Proceeds to home page
			rd = req.getRequestDispatcher("/servlet2");
			rd.forward(req, res);
		}
		else
		{
			// Redirect to login page
			out.print("<h4> Invalid email and password</h4>");
			rd =req.getRequestDispatcher("/index.html");
			rd.include(req, res);
		}
	}

}
