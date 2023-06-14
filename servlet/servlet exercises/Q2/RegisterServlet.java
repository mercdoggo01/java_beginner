package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegisterServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name = req.getParameter("user_name");
		String email = req.getParameter("user_email");
		String  password= req.getParameter("user_password");
		String  designation = req.getParameter("designation");
		
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		out.print("<h1>Name entered is: "+ name + "</h1>");
		out.print("<h1>Email entered is: "+ email + "</h1>");
		out.print("<h1>Password entered is: "+ password + "</h1>");
		out.print("<h1>Designation entered is: "+ designation + "</h1>");	
	}
	
            
}
