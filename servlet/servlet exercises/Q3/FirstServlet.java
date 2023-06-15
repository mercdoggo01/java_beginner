package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/register")
public class FirstServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		String email = req.getParameter("user_name");
		String password = req.getParameter("user_password");
		res.setContentType("text/html");
		// using writer
		PrintWriter out = res.getWriter();
		
		RequestDispatcher rd;
		
		//Conditions
	    if("demo@gmail.com".equals(email) && "demo@123".equals(password))
		{
			rd = req.getRequestDispatcher("/homepage.html");
			rd.forward(req, res);
		}
		else
		{
			
			rd=req.getRequestDispatcher("/index.html");
			rd.include(req, res);
			out.print("<h4><center> Incorrect email or password <center></h4>");
		}
	}
   
}
